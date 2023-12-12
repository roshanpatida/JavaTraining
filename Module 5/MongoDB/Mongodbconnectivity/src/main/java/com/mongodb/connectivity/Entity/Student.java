package com.mongodb.connectivity.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Patidar")
public class Student {
	@Id
 private int id;
 private String name;
 private String address;
 private String author;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public Student(int id, String name, String address, String author) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.author = author;
}
 public Student() {}
}
