package com.microservicesUserService.Service;

import java.util.List;

import com.microservicesUserService.Entity.User;

public interface UserService {
	
	//create
User saveUser(User user);

//get all user
List<User>  getAllUser();

//get single user of given id
User getUser(String userId);

//delete user
User deleteUser(String userId);


// updare user
void updateUser(User user,String userId);
}
