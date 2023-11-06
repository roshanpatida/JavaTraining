package com.springnewfeatures.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class HomeController {

	@GetMapping("/home")
	public String home() {
		return "this is Home page";
	}
	
	@GetMapping("/register")
	public String register() {
		return "this is Register Page";
		
	}
	@GetMapping("/login")
	public String login() {
		return "this is Login Page";
		
	}
}
