package com.springnewfeatures.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springnewfeatures.Entity.User;
import com.springnewfeatures.Repository.UserRepository;
import com.springnewfeatures.Services.UserServices;
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository repository;
	@Autowired
	public UserServices services;
	
	@GetMapping("/{username}")// path variable get data from the url and passed to the mentions object 
	public User getSingleUser(@PathVariable("username") String username) {
//		return this.services.getSingleUser(username); // this is for without JPA
		
		User user = this.repository.findByUserName(username);
		return user;
	}
	
	@PreAuthorize("hasRole('ADMIN')") // it is replace the AntMatche and we directly define the access person , but we need to enable the @EnableGlobalMethodSecurity in the Config Class 
	@GetMapping("/getAll")
	public List<User> getAllUsers(){
//		return this.services.getAllUser();
	List<User> user = this.repository.findAll();
		return user;
	}
	
	@PostMapping("/add")// @RequestBody is basacally  convert the json data into the objects which is we passed to the mention obejct in the parameter 
	public void addUser(@RequestBody User user) {
//		this.services.addUser(user);
		 this.repository.save(user);
	}
}


//1:40 minutes paused 