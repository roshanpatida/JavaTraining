package com.ecomerse.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomerse.exception.OrderException;
import com.ecomerse.model.Address;
import com.ecomerse.model.Cart;
import com.ecomerse.model.CartItem;
import com.ecomerse.model.Order;
import com.ecomerse.model.OrderItem;
import com.ecomerse.model.User;
import com.ecomerse.repository.AddressRepository;
import com.ecomerse.repository.CartRepository;
import com.ecomerse.repository.OrderItemRepository;
import com.ecomerse.repository.OrderRepository;
import com.ecomerse.repository.UserRepository;
import com.ecomerse.service.CartItemService;
import com.ecomerse.service.CartService;
import com.ecomerse.service.OrderItemService;
import com.ecomerse.service.OrderService;
import com.ecomerse.service.ProductService;

@Service
public class OrderServiceImplementation implements OrderService {

	@Autowired
	private CartRepository cartRepository;

	@Autowired
	private AddressRepository addressRepository;
	@Autowired
	private CartItemService cartItemService;
	@Autowired
	private OrderItemService orderItemService;
	@Autowired
	private ProductService productService;

	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private OrderItemRepository orderItemRepository;

	@Autowired
	private CartService cartService;

	@Autowired
	private UserRepository userRepository;

	@Override
	public Order creatOrder(User user, Address shippingAddress) {

		shippingAddress.setUser(user);
		Address address = addressRepository.save(shippingAddress);
		user.getAddress().add(address);
		userRepository.save(user);

		Cart cart = cartService.findUserCart(user.getId());
		List<OrderItem> orderItems = new ArrayList<>();

		for (CartItem item : cart.getCartItem()) {
			OrderItem orderItem = new OrderItem();

			orderItem.setPrice(item.getPrice());
			orderItem.setProduct(item.getProduct());
			orderItem.setQuantity(item.getQuantity());
			orderItem.setSize(item.getSize());
			orderItem.setUserId(item.getUserId());
			orderItem.setDiscountPrice(item.getDiscountPrice());

			OrderItem createdOrderItem = orderItemRepository.save(orderItem);
			orderItems.add(createdOrderItem);

		}

		Order createdOrder = new Order();

		createdOrder.setUser(user);
		createdOrder.setOrderItems(orderItems);
		createdOrder.setTotalPrice(cart.getTotalPrice());
		createdOrder.setTotalDiscountedPrice(cart.getTotalDiscountPrice());
		createdOrder.setDiscount(cart.getDiscount());
		createdOrder.setTotalItem(cart.getTotalItem());

		createdOrder.setShippingAddress(shippingAddress);
		createdOrder.setOrderDate(LocalDateTime.now());
		createdOrder.setOrderStatus("PENDING");
		createdOrder.getPaymentDetails().setStatus("PENDING");
		createdOrder.setCreateAt(LocalDateTime.now());

		Order savedOrder = orderRepository.save(createdOrder);

		for (OrderItem item : orderItems) {
			item.setOrder(savedOrder);
			orderItemRepository.save(item);
		}

		return savedOrder;
	}

	@Override
	public Order findOrderById(Long orderId) throws OrderException {
		Optional<Order> opt = orderRepository.findById(orderId);

		if (opt.isPresent()) {
			return opt.get();
		}

		throw new OrderException("Order not exist with id: " + orderId);
	}

	@Override
	public List<Order> usersOrderHistory(Long userId) {
		List<Order> order = orderRepository.getUsersOrders(userId);
		return order;
	}

	@Override
	public Order placedOrder(Long orderId) throws OrderException {
		Order order = findOrderById(orderId);
		order.setOrderStatus("PLACED");
		order.getPaymentDetails().setStatus("COMPLETED");
		return order;
	}

	@Override
	public Order shippedOrder(Long orderId) throws OrderException {
		Order order = findOrderById(orderId);
		order.setOrderStatus("SHIPPED");
		return orderRepository.save(order);

	}
	@Override
	public Order deliveredOrder(Long orderId) throws OrderException {
		Order order = findOrderById(orderId);
		order.setOrderStatus("DELIVERED");
		return orderRepository.save(order);

	}

	@Override
	public Order cancelOrder(Long orderId) throws OrderException {
		Order order = findOrderById(orderId);
		order.setOrderStatus("CANCELLED");
		return orderRepository.save(order);
	}

	@Override
	public List<Order> getAllOrder() {

		return orderRepository.findAll();
	}

	@Override
	public void deleteOrder(Long orderId) throws OrderException {
// this is fdr admin only 
		Order order = findOrderById(orderId);
		orderRepository.deleteById(orderId);
	}

	@Override
	public Order confirmedOrder(Long ordeId) throws OrderException {
		Order order = findOrderById(ordeId);
		order.setOrderStatus("CONFIRMED");
		return orderRepository.save(order);
	}

}
