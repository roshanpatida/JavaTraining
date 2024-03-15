package com.auth.cart.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import com.auth.cart.dto.UserAuth;



@FeignClient(name = "AUTH-SERVICE")
public interface AuthService {
	
	@GetMapping("/user")
	public UserAuth findUserProfileByJwt(@RequestHeader("Authorization")String jwt);
	

	@GetMapping("/user/{userId}")	
	public UserAuth findUserById(@PathVariable Long userId);
}
