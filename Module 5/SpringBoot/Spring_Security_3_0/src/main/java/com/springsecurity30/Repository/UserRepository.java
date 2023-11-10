package com.springsecurity30.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.springsecurity30.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
	
public User findByUsername(String username);
}
