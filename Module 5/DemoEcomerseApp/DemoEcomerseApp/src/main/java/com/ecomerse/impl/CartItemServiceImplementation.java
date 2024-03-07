package com.ecomerse.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomerse.exception.CartItemException;
import com.ecomerse.exception.UserException;
import com.ecomerse.model.Cart;
import com.ecomerse.model.CartItem;
import com.ecomerse.model.Product;
import com.ecomerse.model.User;
import com.ecomerse.repository.CartItemRepository;
import com.ecomerse.repository.CartRepository;
import com.ecomerse.service.CartItemService;
import com.ecomerse.service.UserService;

import ch.qos.logback.classic.Logger;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class CartItemServiceImplementation implements CartItemService{

	@Autowired
	private CartItemRepository cartItemRepository;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private CartRepository  cartRepository;
	
	
	@Override
	public CartItem createCartItem(CartItem cartItem) {
		cartItem.setQuantity(1);
		cartItem.setPrice(cartItem.getProduct().getPrice()*cartItem.getQuantity());
		cartItem.setDiscountPrice(cartItem.getProduct().getDiscountPrice()*cartItem.getQuantity());
		
		return cartItemRepository.save(cartItem);
	}

	@Override
	public CartItem updateCartItem(Long userId, Long id, CartItem cartItem) throws CartItemException, UserException {
		
	CartItem  item = findCartItemById(id);
	User user = userService.findUserById(item.getUserId());
	
	if(user.getId().equals(userId)) { // if cart creatd user will update the cart only it check the user is same or not if same  it will update the cart
		item.setQuantity(cartItem.getQuantity());
		item.setPrice(item.getQuantity()*item.getProduct().getPrice());
		item.setDiscountPrice(item.getProduct().getDiscountPrice()*item.getQuantity());
		
	}
		return cartItemRepository.save(item);
	}

	@Override
	public CartItem isCartItemExist(Cart cart, Product product, String size, Long userId) {
		CartItem cartItem = cartItemRepository.isCartItemExist(cart, product, size, userId);
		
		return cartItem;
	}

	@Override
	public void removeCartItem(Long userId, Long cartItemId) throws CartItemException, UserException {
		CartItem cartItem = findCartItemById(cartItemId);
		
		User user = userService.findUserById(cartItem.getUserId());
		
		User reqUser= userService.findUserById(userId);
		
		if(user.getId().equals(reqUser.getId())) {
			cartItemRepository.deleteById(cartItemId);
		}
		else{
		throw new UserException("You can't remove another users items");
		
		}
		
	}

	@Override
	public CartItem findCartItemById(Long cartItemId) throws CartItemException {
		Optional<CartItem> opt = cartItemRepository.findById(cartItemId);
		if(opt.isPresent()){
			return opt.get();
		}
		else {
			throw new CartItemException("CartItem not found with id: "+cartItemId);
		}
		
	}

}
