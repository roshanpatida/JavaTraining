package com.auth.cart.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class AddItemRequest {

	 private Long productId;
	 
	 
	 private String size;
	 
	 private int quantity;
	 
	 private Integer price;
}
