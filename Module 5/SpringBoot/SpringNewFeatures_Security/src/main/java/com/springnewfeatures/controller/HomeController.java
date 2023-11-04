package com.springnewfeatures.controller;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Home")
public class HomeController {

//	@PreAuthorize("hasRole('NORAML')")
	@GetMapping("/normalUser")
	public ResponseEntity<String> normalUser(){
		return ResponseEntity.ok("this is normal page");
		
	}
	
//	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/adminUser")
	public ResponseEntity<String> adminUser(){
		return ResponseEntity.ok("this is admin user");
		
	}
	
//	@PreAuthorize("hasRole('PUBLIC')")
	@GetMapping("/publicUser")
	public ResponseEntity<String> publcUser(){
		return ResponseEntity.ok("this is public user ");
	}
	
	
}
