package com.springsecurity30.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsecurity30.Entity.User;
import com.springsecurity30.Repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository repository;
	
	@GetMapping("/normal")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public String user() {
		return "this is normal user here";
	}
	
	@GetMapping("/hello")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public String hello() {
		return "hello hello";
	}
	
	
	@PostMapping("/addData")
		public void addData(@RequestBody User user) {
			this.repository.save(user);
		}
	
	
	
}
