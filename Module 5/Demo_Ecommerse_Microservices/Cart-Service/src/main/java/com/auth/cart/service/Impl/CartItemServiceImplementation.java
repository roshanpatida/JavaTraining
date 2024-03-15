package com.auth.cart.service.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth.cart.dto.Product;
import com.auth.cart.dto.UserAuth;
import com.auth.cart.exception.CartItemException;
import com.auth.cart.exception.UserException;
import com.auth.cart.feignclient.AuthService;
import com.auth.cart.model.Cart;
import com.auth.cart.model.CartItem;
import com.auth.cart.repository.CartItemRepository;
import com.auth.cart.repository.CartRepository;
import com.auth.cart.service.CartItemService;

@Service
public class CartItemServiceImplementation implements CartItemService{


	@Autowired
	private AuthService authService;
	@Autowired
	private CartItemRepository cartItemRepository;
	
//	@Autowired
//	private UserService userService;
//	
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
//	User user = userService.findUserById(item.getUserId()); //  monolithic form
	
	UserAuth user = authService.findUserById(item.getUserId()); // this is rest template form using feign client.
	
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

	public void removeCartItem(Long userId, Long cartItemId) throws CartItemException, UserException {
		CartItem cartItem = findCartItemById(cartItemId);
		
//		UserAuth user = userService.findUserById(cartItem.getUserId()); // monolithic form 
		
		UserAuth user = authService.findUserById(cartItem.getUserId()); // this is resttemplate form using feign clien
		
//		UserAuth reqUser= userService.findUserById(userId);// monolithic form
		
		UserAuth reqUser = authService.findUserById(userId);// rest template form using feign.
		
		if(user.getId().equals(reqUser.getId())) {
			cartItemRepository.deleteById(cartItemId);
		}
		else{
		throw new UserException("You can't remove another users items");
		
		}
		
	}

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


