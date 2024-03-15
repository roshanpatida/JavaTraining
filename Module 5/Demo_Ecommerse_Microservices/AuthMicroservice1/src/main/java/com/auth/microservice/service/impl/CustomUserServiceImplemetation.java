package com.auth.microservice.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.auth.microservice.Entity.UserAuth;
import com.auth.microservice.repository.UserAuthRepository;

@Service
public class CustomUserServiceImplemetation implements UserDetailsService {

	@Autowired
	private UserAuthRepository userRepository;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		UserAuth user  = userRepository.findByEmail(username);
		if(user == null) {
			throw new UsernameNotFoundException("User not found wuth email " + username);
		}
		
		
	List<GrantedAuthority> authorities = new ArrayList<>();
	
		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(),authorities);
	}

}
