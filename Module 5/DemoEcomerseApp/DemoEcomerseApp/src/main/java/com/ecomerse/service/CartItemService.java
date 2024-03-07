package com.ecomerse.service;

import com.ecomerse.exception.CartItemException;
import com.ecomerse.exception.UserException;
import com.ecomerse.model.Cart;
import com.ecomerse.model.CartItem;
import com.ecomerse.model.Product;

public interface CartItemService {

	
	public CartItem createCartItem(CartItem cartItem);
	
	
	public CartItem updateCartItem(Long userId,Long id,CartItem cartItem)throws CartItemException, UserException;
	
    public CartItem isCartItemExist(Cart cart, Product product, String size,Long userId);
    
    public void removeCartItem(Long userId,Long cartItemId) throws CartItemException, UserException;
    
    public CartItem findCartItemById(Long cartItemId) throws CartItemException;
    
    
}
