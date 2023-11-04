package com.springnewfeatures.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AnyRequestMatcher;


@Configuration
//@EnableMethodSecurity
public class SecurityConfig {

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
		try {
			httpSecurity.csrf().disable().authorizeHttpRequests()
			.requestMatchers("/Home/normalUser").hasRole("NORMAL")
					.requestMatchers("Home/adminUser").hasRole("ADMIN").requestMatchers("/Home/publicUser")
					.permitAll()
			.anyRequest().authenticated()
					.and().formLogin();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return httpSecurity.build();
	}

	@Bean
	public UserDetailsService userDetailsService() {

		UserDetails normalUser = User.withUsername("Roshan").password(passwordEncoder().encode("password"))
				.roles("NORMAL").build();

		UserDetails adminUser = User.withUsername("Roshan1").password(passwordEncoder().encode("password"))
				.roles("ADMIN").build();
		
		return new InMemoryUserDetailsManager(adminUser,normalUser);
//		return new CustomUserDetailsService();

		
		// we can use annotation for this requestMatcher and we have to enble  in the  configuration class use @enablemethodSecurity then we can use that.
	}

}
