package com.ecomerse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ecomerse.model.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long>{

	@Query("SELECT c from Cart c Where c.user.id=:userId")
	public Cart findByUserId(@Param("userId")Long userId);
	
	
}
