package com.ecomerse.Config;

import java.util.Arrays;
import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

import jakarta.servlet.Filter;
import jakarta.servlet.http.HttpServletRequest;

@Configuration
public class AppConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{
  
	httpSecurity.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().authorizeHttpRequests(Authorize-> Authorize.requestMatchers("/api/**").authenticated().anyRequest().permitAll())
	.addFilterBefore((Filter) new JwtValidator(), BasicAuthenticationFilter.class).csrf().disable()
	.cors().configurationSource(new CorsConfigurationSource() {
		
		@Override
		public CorsConfiguration getCorsConfiguration(HttpServletRequest request) {
			CorsConfiguration cors= new CorsConfiguration();
			cors.setAllowedOrigins(Arrays.asList(

					"https://localhost:3000",
					"http://localhost:8080"));
			cors.setAllowedMethods(Collections.singletonList("*"));
			cors.setAllowCredentials(true);
			cors.setAllowedHeaders(Collections.singletonList("*"));
			cors.setExposedHeaders(Arrays.asList("Authorization"));
			cors.setMaxAge(3600L);
			return cors;
		}
	}).and().httpBasic().and().formLogin();
		
	
	return httpSecurity.build();
}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return  new BCryptPasswordEncoder();
	}
}