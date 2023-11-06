package com.springnewfeatures.Entity;

public class User {
private String username;
private String about;
private String email;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public User(String username, String about, String email) {
	super();
	this.username = username;
	this.about = about;
	this.email = email;
}
public User() {}
}
