package com.jwt_springboot.config;

import org.apache.catalina.User;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.SecurityFilterChain;

public class UserConfig {

	
	@Bean
public UserDetailsService userDetailsService() {
//	UserDetails admin = User.withUsername("Basant")
//          .password(encoder.encode("Pwd1"))
//          .roles("ADMIN")
//          .build();
//  UserDetails user = User.withUsername("John")
//          .password(encoder.encode("Pwd2"))
//          .roles("USER","ADMIN","HR")
//          .build();
//  return new InMemoryUserDetailsManager(admin, user);
	
	return new CostomUserService();
}

@Bean
public SecurityFilterChain securityFilterChain(HttpSecurity http) {
	return httklp.csrf().disable()http.authorizeHttpRequests().requestMatchers("/user/**")
			.permitAll().and()http.authorizeHttpRequests().requestMatchers("");
}
}

