package com.springnewfeatures.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.springnewfeatures.Services.CustomeDetailsService;

// this class is basacally created for basic authetication  and we just configure the basic security style
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
// basic authentication it just get username and password and it will be never logout itself .

	@Autowired
	private CustomeDetailsService customerDetailsService;

	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests().anyRequest().authenticated().and().httpBasic();  // this is for access with  password
		http.csrf().disable().authorizeRequests().antMatchers("/public/**").hasRole("NORMAL").// this mean only NORAML
																								// assigned user can
																								// access that other
																								// user are not access
																								// them.
				antMatchers("/user/**").hasRole("ADMIN"). // Only ADMIN user can access that.
				anyRequest().authenticated().and().formLogin(); // .httpBasic();
	}

	// take configure method for set our own user and password which is define
	// through this , and set role it mean roles are NORMAL OR ADMIN

	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("Roshan").password("123").roles("NORMAL");
//		auth.inMemoryAuthentication().withUser("hari").password("321").roles("ADMIN");

		// it is for BCryp..... password encoder
		// it convert our password in the toughest hashcode which is not configured byt
		// another one. it mean it is more secure
//		auth.inMemoryAuthentication().withUser("Roshan").passwz	ord(this.passwordEncoder().encode("roshan")).roles("NORMAL");
//		auth.inMemoryAuthentication().withUser("hari").password(this.passwordEncoder().encode("321")).roles("ADMIN");

		auth.userDetailsService(customerDetailsService).passwordEncoder(passwordEncoder());

	}

	// we need to justify the password type and take method of passwordEncoder which
	// is present int the Cofi.... class

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
//		return NoOpPasswordEncoder.getInstance();
		return new BCryptPasswordEncoder(10);// password security
	}

}
