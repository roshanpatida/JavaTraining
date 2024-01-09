package com.microservicesUserService.Service.Impl;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

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
import ch.qos.logback.classic.Logger;

@Service
public class UserServiceImpl implements UserService {

	
     private Logger logger = (Logger) LoggerFactory.getLogger(UserServiceImpl.class);
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
		logger.info("on the way.......");
// 
		
		// using restTemplte we use other service.
		Rating[] ratingOfUser =  restTemplate.getForObject("http://RATING-SERVICE/ratings/users/" + user.getUserId(), Rating[].class);  //dynamic form of
		
		
		List<Rating> ratings = Arrays.stream(ratingOfUser).toList();
		logger.info("rating is :{} " + ratingOfUser);
		List<Rating> ratingList = ratings.stream().map(rating -> {
	
		
		
//		//[ " this is for fetch hotel without feign client interface use.
//			ResponseEntity<Hotel> forEntity = restTemplate.getForEntity("http://HOTEL-SERVICE/hotels/" + rating.getHotelId(),Hotel.class);
//					Hotel hotel = forEntity.getBody();
//			//]	
		
		Hotel hotel = hotelService.getHotels(rating.getHotelId()); // feign client 
		
		
		// set the hotel to ratings
			rating.setHotel(hotel);
			return rating;
		// return the rating
		}).collect(Collectors.toList());
		user.setRatings(ratingList);
		System.out.println("+++++++++++++++++++++++++++++++++++++"+userId.toString());
		

		return user;
	}

	
	

	
	
	@Override
	public User deleteUser(String userId) {
		repository.deleteById(userId);
       return null;
	}

	@Override
	public void updateUser(User user, String userId) {
		// TODO Auto-generated method stub
		

	}

}
