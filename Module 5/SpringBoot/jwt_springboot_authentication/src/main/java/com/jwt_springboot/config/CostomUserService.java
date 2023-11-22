package com.jwt_springboot.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.jwt_springboot.Entity.UserInfo;
import com.jwt_springboot.Repository.UserInfoRepository;

@Component
public class CostomUserService implements UserDetailsService{

	@Autowired
	private UserInfoRepository infoRepository;
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		UserInfo user = new UserInfo();
//		if(user == null) {
//			throw new UsernameNotFoundException(username);
//		}
//		return new CostomUserDetails(user);
//	}

	  @Override
	    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	        Optional<UserInfo> userInfo = infoRepository.findByName(username);
	        return userInfo.map(CostomUserDetails::new)
	                .orElseThrow(() -> new UsernameNotFoundException("user not found " + username));
}
}
