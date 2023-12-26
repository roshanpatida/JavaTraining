package com.microservicesUserService.Exception;

public class ResourceNotFoundException  extends RuntimeException{

	
	public ResourceNotFoundException() {
		super("Resources not found on server !");
	}
	
	public ResourceNotFoundException(String message) {
		super(message);
	}
}
