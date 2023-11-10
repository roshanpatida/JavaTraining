package com.springsecurity30.Service;


import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;


import com.springsecurity30.Entity.ComtomDetails;
import com.springsecurity30.Entity.User;
import com.springsecurity30.Repository.UserRepository;

@Component
public class CostomDetailsService  implements UserDetailsService{

	@Autowired
	private UserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = this.repository.findByUsername(username);
		if(user == null) {
			throw new UsernameNotFoundException("NOT  found");
		}
		return new ComtomDetails(user);
	}
	
}
