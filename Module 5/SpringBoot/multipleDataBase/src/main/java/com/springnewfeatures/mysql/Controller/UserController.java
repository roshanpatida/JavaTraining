package com.springnewfeatures.mysql.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springnewfeatures.mysql.Entity.User;
import com.springnewfeatures.mysql.Repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	public UserRepository repository;
	
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return this.repository.save(user);
	
	}
	@GetMapping("getUser")
	public List<User> getUser() {
	  return this.repository.findAll();
	}
}
