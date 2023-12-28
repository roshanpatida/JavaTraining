package com.hotelService.Exception;

public class ResourceNotFoundException extends RuntimeException{

	public ResourceNotFoundException() {
		super("resource not found");
		
	}
	public ResourceNotFoundException(String s) {
		super(s);
		
	}

	
}
