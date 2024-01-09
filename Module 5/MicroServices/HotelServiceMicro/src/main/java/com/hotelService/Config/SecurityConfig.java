package com.hotelService.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true) // we can put the authorization in the controllers methods using this annotation.
public class SecurityConfig {

	

	public SecurityFilterChain filterChain(HttpSecurity security) throws Exception {
	
		security
		.authorizeHttpRequests()
		.anyRequest()
		.authenticated()
		.and()
		.oauth2ResourceServer()
		.jwt();
		
		
		return security.build();
		
}}
