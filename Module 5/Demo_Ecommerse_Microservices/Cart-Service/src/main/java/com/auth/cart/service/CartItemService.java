package com.auth.cart.service;

import com.auth.cart.dto.Product;
import com.auth.cart.exception.CartItemException;
import com.auth.cart.exception.UserException;
import com.auth.cart.model.Cart;
import com.auth.cart.model.CartItem;

public interface CartItemService {

	

	public CartItem createCartItem(CartItem cartItem);
	
	
	public CartItem updateCartItem(Long userId,Long id,CartItem cartItem)throws CartItemException, UserException;
	
    public CartItem isCartItemExist(Cart cart, Product product, String size,Long userId);
    
    public void removeCartItem(Long userId,Long cartItemId) throws CartItemException, UserException;
    
    public CartItem findCartItemById(Long cartItemId) throws CartItemException;
    
    
}