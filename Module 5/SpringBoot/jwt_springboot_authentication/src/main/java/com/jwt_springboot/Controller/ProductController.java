package com.jwt_springboot.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jwt_springboot.Entity.UserInfo;
import com.jwt_springboot.Repository.UserInfoRepository;

@RestController
public class ProductController {

	private UserInfoRepository infoRepository;
	
	public String getWelcome() {
		return "this is welcome page";
		}
	
	public String addNew(@RequestBody UserInfo user) {
	
	return infoRepository.save(user);
	}
	public String productHome() {
		return "product home page";
	}
}
