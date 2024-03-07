package com.ecomerse.request;

import java.util.HashSet;
import java.util.Set;

import com.ecomerse.model.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(int discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	public int getDiscountPersent() {
		return discountPersent;
	}

	public void setDiscountPersent(int discountPersent) {
		this.discountPersent = discountPersent;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Set<Size> getSize() {
		return size;
	}

	public void setSize(Set<Size> size) {
		this.size = size;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getTopcategory() {
		return topcategory;
	}

	public void setTopcategory(String topcategory) {
		this.topcategory = topcategory;
	}

	public String getSecondLevelCategory() {
		return secondLevelCategory;
	}

	public void setSecondLevelCategory(String secondLevelCategory) {
		this.secondLevelCategory = secondLevelCategory;
	}

	public String getThirdLeveCategory() {
		return thirdLeveCategory;
	}

	public void setThirdLeveCategory(String thirdLeveCategory) {
		this.thirdLeveCategory = thirdLeveCategory;
	}

	public CreateProductRequest(String title, String description, int price, int discountedPrice, int discountPersent,
			int quantity, String brand, String color, Set<Size> size, String imageUrl, String topcategory,
			String secondLevelCategory, String thirdLeveCategory) {
		super();
		this.title = title;
		this.description = description;
		this.price = price;
		this.discountedPrice = discountedPrice;
		this.discountPersent = discountPersent;
		this.quantity = quantity;
		this.brand = brand;
		this.color = color;
		this.size = size;
		this.imageUrl = imageUrl;
		this.topcategory = topcategory;
		this.secondLevelCategory = secondLevelCategory;
		this.thirdLeveCategory = thirdLeveCategory;
	}

	public CreateProductRequest() {
		// TODO Auto-generated constructor stub
	}
	
}
