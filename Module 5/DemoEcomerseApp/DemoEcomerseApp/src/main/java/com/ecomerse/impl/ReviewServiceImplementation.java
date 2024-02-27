package com.ecomerse.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomerse.exception.ProductException;
import com.ecomerse.exception.UserException;
import com.ecomerse.model.Product;
import com.ecomerse.model.Review;
import com.ecomerse.model.User;
import com.ecomerse.repository.ProductRepository;
import com.ecomerse.repository.ReviewRepository;
import com.ecomerse.request.ReviewRequest;
import com.ecomerse.service.ProductService;
import com.ecomerse.service.ReviewService;

@Service
public class ReviewServiceImplementation implements ReviewService {

	@Autowired
	private ReviewRepository reviewRepository;
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private ProductRepository productRepository;
	
	
	@Override
	public Review createReview(ReviewRequest req, User user) throws ProductException, UserException {
		Product product = productService.findProductById(req.getProductId());
		
		Review review = new Review();
		review.setUser(user);
		review.setProduct(product);
		review.setReview(req.getReview());
		review.setCreateAt(LocalDateTime.now());
		return reviewRepository.save(review);
	}

	@Override
	public List<Review> getAllReviewName(Long productId) {
          
		return reviewRepository.getAllProductReview(productId);
	}

	
	
}
