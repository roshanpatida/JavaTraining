package com.ecomerse.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ecomerse.model.User;
import com.ecomerse.repository.UserRepository;

@Service
public class CustomUserServiceImplemetation implements UserDetailsService {

	
	private UserRepository userRepository;
	
	public CustomUserServiceImplemetation(UserRepository  userRepository) {
		this.userRepository = userRepository;
	}
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user  = userRepository.findByEmail(username);
		if(user == null) {
			throw new UsernameNotFoundException("User not found wuth email " + username);
		}
		
		
	List<GrantedAuthority> authorities = new ArrayList<>();
	
		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(),authorities);
	}

}
