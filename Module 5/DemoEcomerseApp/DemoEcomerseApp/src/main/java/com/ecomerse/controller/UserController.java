package com.ecomerse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecomerse.exception.UserException;
import com.ecomerse.model.User;
import com.ecomerse.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;

	
	@GetMapping("/profile")
	public ResponseEntity<User> getUserProfileHandler(@RequestHeader("Authorization")String jwt)throws UserException{
		User user = userService.findUserProfileByJwt(jwt);
		return new ResponseEntity<>(user,HttpStatus.ACCEPTED);
	}
}
