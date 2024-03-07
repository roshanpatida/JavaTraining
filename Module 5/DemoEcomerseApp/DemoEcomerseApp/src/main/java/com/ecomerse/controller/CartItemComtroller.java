package com.ecomerse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecomerse.exception.CartItemException;
import com.ecomerse.exception.UserException;
import com.ecomerse.model.User;
import com.ecomerse.payload.ApiResponse;
import com.ecomerse.service.CartItemService;
import com.ecomerse.service.UserService;

@RestController
@RequestMapping("api/cartItem")
public class CartItemComtroller {

	@Autowired
	private UserService userService;
	@Autowired
	private CartItemService cartItemService;
	
	@DeleteMapping("/delete/{CartItemId}")
	public ResponseEntity<ApiResponse> deleteProduct(@PathVariable Long CartItemId,@RequestHeader("Authorization")String jwt)throws UserException, CartItemException{
		User user = userService.findUserProfileByJwt(jwt);
		cartItemService.removeCartItem(user.getId(), CartItemId);
		
		ApiResponse res = new ApiResponse();
		res.setMessage("Deleted Itme Successfully...");
		res.setSuccess(true);
		return new ResponseEntity<>(res,HttpStatus.OK);
	}
	
		
	

}
