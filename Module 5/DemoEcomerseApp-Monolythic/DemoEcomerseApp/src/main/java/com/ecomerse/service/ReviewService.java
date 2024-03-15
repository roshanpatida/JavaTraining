package com.ecomerse.service;

import java.util.List;

import com.ecomerse.exception.ProductException;
import com.ecomerse.exception.UserException;
import com.ecomerse.model.Review;
import com.ecomerse.model.User;
import com.ecomerse.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req, User user) throws ProductException,UserException;
	
	public List<Review> getAllReviewName(Long productId);
}
