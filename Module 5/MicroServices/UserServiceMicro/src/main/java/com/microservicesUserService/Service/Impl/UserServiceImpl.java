package com.microservicesUserService.Service.Impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicesUserService.Entity.User;
import com.microservicesUserService.Exception.ResourceNotFoundException;
import com.microservicesUserService.Repository.UserRepository;
import com.microservicesUserService.Service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;

	@Override
	public User saveUser(User user) {
		String randomUserId = UUID.randomUUID().toString(); // generate unique useId in string form
		user.setUserId(randomUserId);
		return repository.save(user);
		
	}

	@Override
	public List<User> getAllUser() {

		return repository.findAll();
	}

	
	// get single user
	@Override
	public User getUser(String userId) {
		// get user from database with the help of user repository
		User user = repository.findById(userId).orElseThrow(
				() -> new ResourceNotFoundException("User with given id is not fount on server : " + userId));
		// fetch rating of above user from rating service
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
