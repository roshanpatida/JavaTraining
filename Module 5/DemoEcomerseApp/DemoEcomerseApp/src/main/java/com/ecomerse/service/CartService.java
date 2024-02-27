package com.ecomerse.service;

import com.ecomerse.exception.ProductException;
import com.ecomerse.model.Cart;
import com.ecomerse.model.User;
import com.ecomerse.request.AddItemRequest;

public interface CartService {

	public Cart createCart(User user);
	
	public String addCartItem(Long userId,AddItemRequest req) throws ProductException;

	public Cart findUserCart(Long userId);
	
	
}
