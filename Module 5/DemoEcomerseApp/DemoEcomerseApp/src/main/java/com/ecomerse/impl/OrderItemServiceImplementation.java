package com.ecomerse.impl;

import org.springframework.stereotype.Service;

import com.ecomerse.model.OrderItem;
import com.ecomerse.repository.OrderItemRepository;
import com.ecomerse.service.OrderItemService;

@Service
public class OrderItemServiceImplementation implements OrderItemService{

	
	 private OrderItemRepository orderItemRepository;
	 
	 
	@Override
	public OrderItem createOrderItem(OrderItem orderItem) {
	
		return orderItemRepository.save(orderItem);
	
	}

	
}
