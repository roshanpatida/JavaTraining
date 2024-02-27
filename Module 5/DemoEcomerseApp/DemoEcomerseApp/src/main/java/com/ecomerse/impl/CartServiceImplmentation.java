 package com.ecomerse.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomerse.exception.ProductException;
import com.ecomerse.model.Cart;
import com.ecomerse.model.CartItem;
import com.ecomerse.model.Product;
import com.ecomerse.model.User;
import com.ecomerse.repository.CartRepository;
import com.ecomerse.request.AddItemRequest;
import com.ecomerse.service.CartItemService;
import com.ecomerse.service.CartService;
import com.ecomerse.service.ProductService;

@Service
public class CartServiceImplmentation implements CartService {

	@Autowired
	private CartRepository cartRepository;
	
	@Autowired
	private CartItemService cartItemService;
	
	@Autowired
	private ProductService productService;
	
	
	@Override
	public Cart createCart(User user) {
		Cart cart = new Cart();
		cart.setUser(user);
		return cartRepository.save(cart);
	}

	@Override
	public String addCartItem(Long userId, AddItemRequest req) throws ProductException {
		Cart cart = cartRepository.findByUserId(userId);
	  Product product = productService.findProductById(req.getProductId());
	  
	  CartItem isPresent = cartItemService.isCartItemExist(cart, product, req.getSize(), userId);
	  
	  if(isPresent==null){
		  CartItem cartItem = new CartItem();
		  cartItem.setProduct(product);
		  cartItem.setQuantity(req.getQuantity());
		  cartItem.setUserId(userId);
		  
		  int price =  req.getQuantity()*product.getDiscountPrice();
		  cartItem.setPrice(price);
		  cartItem.setSize(req.getSize());
		  
		  CartItem createdCartItem = cartItemService.createCartItem(cartItem);
		  
		  cart.getCartItem().add(createdCartItem);
	  }
		return "Item added successfully";
	}

	@Override
	public Cart findUserCart(Long userId) {
		Cart cart = cartRepository.findByUserId(userId);
		
		int totalPrice = 0;
		int totalDiscountPrice=0;
		int totalItem =0;
		
		
		
		for(CartItem cartItem : cart.getCartItem()) {
			totalPrice +=cartItem.getPrice();
			totalDiscountPrice += cartItem.getDiscountPrice();
			totalItem += cartItem.getQuantity(); 
		}
		
		cart.setTotalDiscountPrice(totalDiscountPrice);
		cart.setTotalItem(totalItem);
		cart.setTotalPrice(totalPrice);
		cart.setDiscount(totalPrice-totalDiscountPrice);
		
		
		return cartRepository.save(cart);
	}

}
