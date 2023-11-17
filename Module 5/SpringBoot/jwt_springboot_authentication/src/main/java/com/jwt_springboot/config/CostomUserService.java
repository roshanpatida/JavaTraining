package com.jwt_springboot.config;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.jwt_springboot.Entity.UserInfo;

public class CostomUserService implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserInfo user = new UserInfo();
		if(user == null) {
			throw new UsernameNotFoundException(username);
		}
		return new CostomUserDetails(user);
	}

}
