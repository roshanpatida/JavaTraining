package com.springnewfeatures.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springnewfeatures.Entity.User;

@Service
public class UserServices {

	List<User> list = new ArrayList<>();
	
	// just I create the fake api which is checked for security request
	public UserServices() {
		list.add(new User("roshan" ,"Devloper","roshan.patidar@brainvire.com"));
		list.add(new User("deepak" ,"Devloper","roshan.patidar@brainvire.com"));
		list.add(new User("abhi" ,"Devloper","roshan.patidar@brainvire.com"));
	}
	
	public List<User> getAllUser(){
		return this.list;
	}
	
	public User getSingleUser(String username) {
		return this.list.stream().filter((user)->user.getUsername().equals(username)).findAny().orElse(null);
		
	}
	
	public void addUser(User user) {
		this.list.add(user);
	}
 }
