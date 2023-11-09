package com.springnewfeatures.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "spring_security_before")
public class User {
	
@Id
private String username;
private String about;
private String password;
private String role;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getAbout() {
	return about;
}
public void setAbout(String about) {
	this.about = about;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public User(String username, String about, String password, String role) {
	super();
	this.username = username;
	this.about = about;
	this.password = password;
	this.role = role;
}
public User() {}
}
