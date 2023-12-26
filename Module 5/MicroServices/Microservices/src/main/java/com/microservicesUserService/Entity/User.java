package com.microservicesUserService.Entity;

import com.fasterxml.jackson.core.sym.Name;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;

@Entity
@Table(name = "micro_user")
@Builder
public class User {
	
	@Id
	@Column(name = "ID")
	private String userId;
	
	@Column(name =  "NAME",length = 20)
	private String	name;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "ABOUT")
	private String about;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public User(String userId, String name, String email, String about) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.about = about;
	}
	
public User() {}
}
