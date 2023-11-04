package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.User;

public interface UserRepository  extends CrudRepository<User, Integer>{

	public List<User> findByName(String name);	
	public List<User> findByNameAndCity(String name, String city);
	
	@Query("select u from User u")
	public List<User> getAllUser();
	
	@Query("select u from User u WHERE u.name=:n")
	public List<User> getUserByName(@Param("n") String name);
 
}
