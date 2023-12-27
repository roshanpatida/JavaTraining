package com.microservicesUserService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicesUserService.Entity.User;
import com.microservicesUserService.Service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;

	
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user){
		User user1 = userService.saveUser(user); 
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
	}
	
	//single user get
	@GetMapping("/{userId}")
	public ResponseEntity<User> getSingleUser(@PathVariable String userId){
			User user1 = userService.getUser(userId);
			return ResponseEntity.ok(user1);
	}
	
	// get all users
	@GetMapping
	public ResponseEntity<List<User>> getAllUser(){
		List<User> user = userService.getAllUser();
		return ResponseEntity.ok(user);
	}}
