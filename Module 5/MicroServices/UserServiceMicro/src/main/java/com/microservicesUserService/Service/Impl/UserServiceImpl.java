package com.microservicesUserService.Service.Impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.apache.hc.client5.http.entity.UrlEncodedFormEntity;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservicesUserService.Entity.Hotel;
import com.microservicesUserService.Entity.Rating;
import com.microservicesUserService.Entity.User;
import com.microservicesUserService.Exception.ResourceNotFoundException;
import com.microservicesUserService.ExternalService.HotelService;
import com.microservicesUserService.Repository.UserRepository;
import com.microservicesUserService.Service.UserService;
import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

import ch.qos.logback.classic.Logger;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private HotelService  hotelService;
	
	@Override
	public User saveUser(User user) {
		String randomUserId = UUID.randomUUID().toString(); // generate unique useId in string form
		user.setUserId(randomUserId);
		return repository.save(user);
		
	}

	// get all user
	@Override
	public List<User> getAllUser() {
// implements the restTemplates and get all the users rating. with their data.
		return repository.findAll();
	}

	
	// get single user
	@Override
	public User getUser(String userId) {
		// get user from database with the help of user repository
		User user = repository.findById(userId).orElseThrow(
				() -> new ResourceNotFoundException("User with given id is not fount on server : " + userId));
//  http://localhost:8083/ratings/users/9fb029f1-1da7-48ca-80a8-f22e21fd41c2
		
		// fetch rating of above user from rating service
		// it just static form of rating means se can fetch the rating of only set userId in the url.
//		ArrayList forObject =  restTemplate.getForObject("http://localhost:8083/ratings/users/9fb029f1-1da7-48ca-80a8-f22e21fd41c2", ArrayList.class); // atatic form of
		
		Rating[] ratingOfUser =  restTemplate.getForObject("http://RATING-SERVICE/ratings/users/" + user.getUserId(), Rating[].class);  //dynamic form of
		
		
		List<Rating> ratings = Arrays.stream(ratingOfUser).toList();
		List<Rating> ratingList = ratings.stream().map(rating -> {
		// api call to hotel service to get hotel
		//	http://localhost:8082/hotels/2 // is this use 
			
		System.out.println(rating.getHotelId());
		
//		//[ " this is for fetch hotel without feign client interface use.
//			ResponseEntity<Hotel> forEntity = restTemplate.getForEntity("http://HOTEL-SERVICE/hotels/" + rating.getHotelId(),Hotel.class);
//					Hotel hotel = forEntity.getBody();
//			//]	
		
		Hotel hotel = hotelService.getHotels(rating.getHotelId());
		
		
		// set the hotel to ratings
			rating.setHotel(hotel);
			return rating;
		// return the rating
		}).collect(Collectors.toList());
		user.setRatings(ratingList);
		return user;
	}

	
	

	
	
	@Override
	public User deleteUser(String userId) {
		
		return null;
	}

	@Override
	public void updateUser(User user, String userId) {
		// TODO Auto-generated method stub

	}

}
