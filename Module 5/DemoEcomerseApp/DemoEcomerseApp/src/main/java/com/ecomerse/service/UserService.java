package com.ecomerse.service;

import com.ecomerse.exception.UserException;
import com.ecomerse.model.User;

public interface UserService {

	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt)throws UserException;
}
