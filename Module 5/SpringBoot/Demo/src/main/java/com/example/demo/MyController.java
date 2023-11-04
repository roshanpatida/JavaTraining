package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class MyController {
	@RequestMapping("/")
public String to() {
		System.out.println("Hello this is mycontroller class");
	return "to";
}
	 @RequestMapping("/contact")
	public String contact() {
		System.out.println("this is contact");
		return "contact";
	}
}
