		package com.auth.microservice.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth.microservice.Entity.UserAuth;
import com.auth.microservice.Exception.UserException;
import com.auth.microservice.config.JwtProvider;
import com.auth.microservice.repository.UserAuthRepository;
import com.auth.microservice.service.UserAuthService;


@Service
public class UserAuthServiceImplmentation implements UserAuthService{

	@Autowired
	private UserAuthRepository userRepository;
	
	@Autowired
	private JwtProvider  jwtProvider;
	
	
	@Override
	public UserAuth findUserById(Long userId) throws UserException {
		Optional<UserAuth> user = userRepository.findById(userId);
		if(user.isPresent()) {
			return user.get();
		}
		
	throw new UserException("User not found with user id :- "+userId);
	}

	@Override
	public UserAuth findUserProfileByJwt(String jwt) throws UserException {
		String email = jwtProvider.getEmailFromToken(jwt);
		
		UserAuth user =  userRepository.findByEmail(email);
		
		
		if(user == null) {
			throw new UserException("User not found with email: "+email);
			
		}
		
		return user;
	}

}
