package com.auth.microservice.service;

import com.auth.microservice.Entity.UserAuth;
import com.auth.microservice.Exception.UserException;

public interface UserAuthService {

	
	public UserAuth findUserById(Long userId) throws UserException;
	
	public UserAuth findUserProfileByJwt(String jwt) throws UserException;
}
