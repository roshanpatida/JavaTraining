package com.auth.cart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.auth.cart.dto.AddItemRequest;
import com.auth.cart.dto.UserAuth;
import com.auth.cart.exception.CartItemException;
import com.auth.cart.exception.ProductException;
import com.auth.cart.exception.UserException;
import com.auth.cart.feignclient.AuthService;
import com.auth.cart.model.Cart;
import com.auth.cart.payload.ApiResponse;
import com.auth.cart.service.CartItemService;
import com.auth.cart.service.CartService;

@RestController
@RequestMapping("api/cart")
//@Tag(name = "Cart Management" ,desciption = "find user cart, add item to cart")
public class CartController {


	private AuthService authService;

	CartController(AuthService authService) {
		this.authService = authService;
	}

	@Autowired
	private CartService cartService;

	@Autowired
	private CartItemService cartItemService;

	@GetMapping("/")
	// find cart by user Id
	public ResponseEntity<Cart> findUserCart(@RequestHeader("Authorization") String jwt) throws UserException {
//		User user = userService.findUserProfileByJwt(jwt); // this is monolithic form

		UserAuth user = authService.findUserProfileByJwt(jwt); // rest template used here.

		Cart cart = cartService.findUserCart(user.getId());
		return new ResponseEntity<Cart>(cart, HttpStatus.OK);
	}

	@PutMapping("/add")
	// add item to cart
	public ResponseEntity<ApiResponse> addItemToCart(@RequestBody AddItemRequest req,
			@RequestHeader("Authorization") String jwt) throws UserException, ProductException {
//		UserAuth user = restTemplate.getForObject("http://localhost:8082/auth/user", UserAuth.class);
		UserAuth user = authService.findUserProfileByJwt(jwt);// rest template used here.
		// get user from token with the help of above User creation
		cartService.addCartItem(user.getId(), req);

		ApiResponse res = new ApiResponse();
		res.setMessage("Item added to cart");
		res.setSuccess(true);

		return new ResponseEntity<ApiResponse>(res, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{CartItemId}")
	public ResponseEntity<ApiResponse> deleteProduct(@PathVariable Long CartItemId,
			@RequestHeader("Authorization") String jwt) throws UserException, CartItemException {
//		User user = userService.findUserProfileByJwt(jwt); // this is monolithic form.
		UserAuth user = authService.findUserProfileByJwt(jwt); // rest template used here.
		cartItemService.removeCartItem(user.getId(), CartItemId);

		ApiResponse res = new ApiResponse();
		res.setMessage("Deleted Itme Successfully...");
		res.setSuccess(true);
		return new ResponseEntity<>(res, HttpStatus.OK);
	}
	// this is for feign client
	@PostMapping("/create")
	public Cart createCart(@RequestBody UserAuth user) {
		return cartService.createCart(user);
		
	}

}
