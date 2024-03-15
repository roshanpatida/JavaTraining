package com.auth.product.model;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class CreateProductRequest {

	private String title;
	private String description;
	private int price;
	private int discountedPrice;
	private int discountPersent;
	private int quantity;
	
	private String brand;
	
	private String color;
	
	private Set<Size> size =new HashSet<>();
	
	private String imageUrl;
	
	

	
	private String topcategory; // man 
	
	private String secondLevelCategory;// clothing mens kurte
	
	private String thirdLeveCategory; // mens shirt
}
	