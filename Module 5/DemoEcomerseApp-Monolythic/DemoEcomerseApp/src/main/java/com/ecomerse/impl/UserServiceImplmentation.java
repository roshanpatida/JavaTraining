package com.ecomerse.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomerse.Config.JwtProvider;
import com.ecomerse.exception.UserException;
import com.ecomerse.model.User;
import com.ecomerse.repository.UserRepository;
import com.ecomerse.service.UserService;

@Service
public class UserServiceImplmentation implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private JwtProvider  jwtProvider;
	
	
	@Override
	public User findUserById(Long userId) throws UserException {
		Optional<User> user = userRepository.findById(userId);
		if(user.isPresent()) {
			return user.get();
		}
		
	throw new UserException("User not found with user id :- "+userId);
	}

	@Override
	public User findUserProfileByJwt(String jwt) throws UserException {
		String email = jwtProvider.getEmailFromToken(jwt);
		
		User user =  userRepository.findByEmail(email);
		
		if(user == null) {
			throw new UserException("User not found with email: "+email);
			
		}
		
		return user;
	}

}
