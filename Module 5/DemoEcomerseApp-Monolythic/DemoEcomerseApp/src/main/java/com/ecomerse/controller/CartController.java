package com.ecomerse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecomerse.exception.ProductException;
import com.ecomerse.exception.UserException;
import com.ecomerse.model.Cart;
import com.ecomerse.model.User;
import com.ecomerse.payload.ApiResponse;
import com.ecomerse.request.AddItemRequest;
import com.ecomerse.service.CartService;
import com.ecomerse.service.UserService;

@RestController
@RequestMapping("api/cart")
//@Tag(name = "Cart Management" ,desciption = "find user cart, add item to cart")
public class CartController {

	@Autowired
	private CartService cartService;
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	// find cart by user Id
	public ResponseEntity<Cart> findUserCart(@RequestHeader("Authorization") String jwt)throws UserException{
		User user = userService.findUserProfileByJwt(jwt);
		
		Cart cart = cartService.findUserCart(user.getId());
		return new ResponseEntity<Cart>(cart,HttpStatus.OK);
	}
	
	@PutMapping("/add")
	// add item to cart
	public ResponseEntity<ApiResponse> addItemToCart(@RequestBody AddItemRequest req,
			@RequestHeader("Authorization") String jwt) throws UserException,ProductException{
		User user = userService.findUserProfileByJwt(jwt);
		// get user from token with the help of above User creation 
		cartService.addCartItem(user.getId(), req);
		
		ApiResponse res = new ApiResponse();
		res.setMessage("Item added to cart");
		res.setSuccess(true);
	    
		return new ResponseEntity<ApiResponse>(res,HttpStatus.OK);
	}

}
