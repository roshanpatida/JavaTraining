package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@ResponseBody
@RequestMapping("/test")
@Controller
public class MyController {
 public String  to() {
	 return "Hello";
	 
 }
}
