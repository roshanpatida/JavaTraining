package com.auth.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auth.microservice.Entity.UserAuth;

@Repository				
public interface UserAuthRepository extends JpaRepository<UserAuth, Long> {

	
	public UserAuth findByEmail(String email);
}
