package com.enotes.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;



@Data
@Entity
public class UserDtls {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "full_name")
	private String name;
	private String email;
	private String password;
	private String about;
	private String role;
	
	
	
	public UserDtls() {
		// TODO Auto-generated constructor stub
	}	
	
}
