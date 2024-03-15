package com.auth.cart.model;

import java.util.HashSet;
import java.util.Set;

import com.auth.cart.dto.UserAuth;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
//	@OneToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "user_id",nullable = false)
	private UserAuth user;

//	@OneToMany(mappedBy = "cart",cascade = CascadeType.ALL,orphanRemoval = true)
//	@Column(name ="cart_items")
	private Set<CartItem> cartItem = new HashSet<>();
	
	@Column(name= "total_price")
	private double totalPrice;
	
	private int totalItem;
	
	private int totalDiscountPrice;
	
	private int discount;
	
}
