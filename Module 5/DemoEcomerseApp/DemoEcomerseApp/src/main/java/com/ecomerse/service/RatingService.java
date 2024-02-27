package com.ecomerse.service;

import java.util.List;

import com.ecomerse.exception.ProductException;
import com.ecomerse.model.Rating;
import com.ecomerse.model.User;
import com.ecomerse.request.RatingRequest;

public interface RatingService {

	public Rating createRating(RatingRequest req, User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);
	
	
	
}
