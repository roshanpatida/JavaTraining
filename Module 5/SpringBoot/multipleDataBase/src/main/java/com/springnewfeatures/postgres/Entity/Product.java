package com.springnewfeatures.postgres.Entity;

import com.springnewfeatures.mysql.Entity.User;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product_postgres1")
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@Builder
public class Product {

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int id;
	private String category;
	private String quantity;
	

	
public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

public Product(int id, String category, String quantity) {
		super();
		this.id = id;
		this.category = category;
		this.quantity = quantity;
	}

public Product() {}
}
