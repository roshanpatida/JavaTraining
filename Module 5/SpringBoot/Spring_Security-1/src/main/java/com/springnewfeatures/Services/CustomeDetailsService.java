package com.springnewfeatures.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springnewfeatures.Entity.CustomerDetails;
import com.springnewfeatures.Entity.User;
import com.springnewfeatures.Repository.UserRepository;

@Service
public class CustomeDetailsService  implements UserDetailsService{
	@Autowired
private UserRepository repository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		 User user = this.repository.findByUsername(username);
		if(user == null) {
			throw new UsernameNotFoundException("NOT  found");
		}
		return new CustomerDetails(user);
	}

}																										
