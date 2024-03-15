package com.ecomerse.service;

import java.util.List;

import com.ecomerse.exception.OrderException;
import com.ecomerse.model.Address;
import com.ecomerse.model.Order;
import com.ecomerse.model.User;

public interface OrderService {

	
	public Order creatOrder(User user, Address shippingAddress);
	
	public Order findOrderById(Long orderId) throws OrderException;
	
	public List<Order> usersOrderHistory(Long userId);
	
	
	public Order placedOrder(Long orderId) throws OrderException;

	public Order shippedOrder(Long orderId) throws OrderException;
	
	public Order deliveredOrder(Long orderId) throws OrderException;
	
	public Order confirmedOrder(Long ordeId) throws OrderException;
	public Order cancelOrder(Long orderId) throws OrderException;
	
	public List<Order> getAllOrder();
	
	
	//its modified as per error
	public Order deleteOrder(Long orderId) throws OrderException;
	
	
	//its actual method
//	public void deleteOrder(Long orderId) throws OrderException;
	



}

