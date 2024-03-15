package com.auth.cart.service;



import com.auth.cart.dto.AddItemRequest;
import com.auth.cart.dto.UserAuth;
import com.auth.cart.exception.ProductException;
import com.auth.cart.model.Cart;

public interface CartService {


	public Cart createCart(UserAuth user);
	
	public String addCartItem(Long userId,AddItemRequest req) throws ProductException;

	public Cart findUserCart(Long userId);

	
}
