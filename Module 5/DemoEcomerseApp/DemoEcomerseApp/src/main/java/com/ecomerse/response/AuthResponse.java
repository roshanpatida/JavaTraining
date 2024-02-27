package com.ecomerse.response;

public class AuthResponse {

	
	private String Jwt;
	private String message;
	public AuthResponse() {
	
	}
	public String getJwt() {
		return Jwt;
	}
	public void setJwt(String jwt) {
		Jwt = jwt;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
		
	}
	

