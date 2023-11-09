package com.springnewfeatures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import com.springnewfeatures.Entity.User;
import com.springnewfeatures.Repository.UserRepository;


@SpringBootApplication

public class SpringSecurity1Application  implements CommandLineRunner{

	@Autowired
	private UserRepository repository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurity1Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setUsername("roshan");
		user.setAbout("hello");
		user.setPassword(this.bCryptPasswordEncoder.encode("roshan"));
		user.setRole("ROLE_NORMAL");
		this.repository.save(user);
		
		
		User user1 = new User();
		user1.setUsername("patidar");
		user1.setAbout("about");
		user1.setPassword(this.bCryptPasswordEncoder.encode("patidar"));
		user1.setRole("ROLE_ADMIN");
		this.repository.save(user1);
		}

}
