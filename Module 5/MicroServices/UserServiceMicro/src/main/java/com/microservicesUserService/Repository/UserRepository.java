package com.microservicesUserService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservicesUserService.Entity.User;

public interface UserRepository  extends JpaRepository<User, String>{

	
	//if you want to implements any custom method or query 
	//
}
