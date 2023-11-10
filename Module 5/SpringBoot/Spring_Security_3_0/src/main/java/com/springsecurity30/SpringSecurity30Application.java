package com.springsecurity30;

import org.hibernate.annotations.AnyDiscriminator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.springsecurity30.Entity.User;
import com.springsecurity30.Repository.UserRepository;

@SpringBootApplication
public class SpringSecurity30Application   {

	
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurity30Application.class, args);
	}

	
}
