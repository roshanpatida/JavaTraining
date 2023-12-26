package com.microservicesUserService.Service.Impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.microservicesUserService.Entity.User;
import com.microservicesUserService.Exception.ResourceNotFoundException;
import com.microservicesUserService.Repository.UserRepository;
import com.microservicesUserService.Service.UserService;

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

	@Override
	public User getUser(String userId) {
		return repository.findById(userId).orElseThrow(
				() -> new ResourceNotFoundException("User with given id is not fount on server : " + userId));
	}

	@Override
	public User deleteUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(User user, String userId) {
		// TODO Auto-generated method stub

	}

}
