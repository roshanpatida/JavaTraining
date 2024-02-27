package com.ecomerse.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ecomerse.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

//	@Query("SELECT 0 From Order o Where o.user.id=:userId AND (o.orderStatus = PLACED OR o.orderStatus = CONFIRMED OR o.orderStatus= SHIPPERD OR o.orderStatus = DELIVERED)")
//	public List<Order> getUsersOrders(@Param("userId") Long userId);
	
	
}
