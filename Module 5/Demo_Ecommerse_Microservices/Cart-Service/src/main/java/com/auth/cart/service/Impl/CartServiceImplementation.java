package com.auth.cart.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth.cart.dto.AddItemRequest;
import com.auth.cart.dto.Product;
import com.auth.cart.dto.UserAuth;
import com.auth.cart.feignclient.ProductService;
import com.auth.cart.model.Cart;
import com.auth.cart.model.CartItem;
import com.auth.cart.repository.CartRepository;
import com.auth.cart.service.CartItemService;
import com.auth.cart.service.CartService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CartServiceImplementation implements CartService {

	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CartRepository cartRepository;

	@Autowired
	private CartItemService cartItemService;

	@Override
	public Cart createCart(UserAuth user) {
		Cart cart = new Cart();
		cart.setUser(user);		
		return cartRepository.save(cart);
	}

	@Override
	public String addCartItem(Long userId, AddItemRequest req) {
	Cart cart = cartRepository.findByUserId(userId);
//	  Product product = productService.findProductById(req.getProductId());// rest template re require
	 Product product =  productService.findProductByIdHandler(req.getProductId());
	 
	 
	  CartItem isPresent = cartItemService.isCartItemExist(cart, product, req.getSize(), userId);
	  
	  if(isPresent==null){
		  CartItem cartItem = new CartItem();
		  cartItem.setProduct(product);
		  cartItem.setQuantity(req.getQuantity());
		  cartItem.setUserId(userId);
		  
		  int price =  req.getQuantity()*product.getDiscountPrice();
		  cartItem.setPrice(price);
		  cartItem.setSize(req.getSize());
		  cartItem.setCart(cart);
		  log.info("cart : {}",cartItem.getCart());
		  CartItem createdCartItem = (CartItem) cartItemService.createCartItem(cartItem);
		  
		  cart.getCartItem().add(createdCartItem);
	  }
		return "Item added successfully";
	}

	@Override
	public Cart findUserCart(Long userId) {
		Cart cart = cartRepository.findByUserId(userId);

		int totalPrice = 0;
		int totalDiscountPrice = 0;
		int totalItem = 0;

		for (CartItem cartItem : cart.getCartItem()) {
			totalPrice += cartItem.getPrice();
			totalDiscountPrice += cartItem.getDiscountPrice();
			totalItem += cartItem.getQuantity();
		}
		log.info("totalprice : {}", totalPrice);
		log.info("totaldiscount : {}", totalDiscountPrice);
		log.info("totalitem : {}", totalItem);
		cart.setTotalDiscountPrice(totalDiscountPrice);
		cart.setTotalItem(totalItem);
		cart.setTotalPrice(totalPrice);
		cart.setDiscount(totalPrice - totalDiscountPrice);

		return cartRepository.save(cart);
	}

}
