package com.ecomerse.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomerse.exception.ProductException;
import com.ecomerse.model.Product;
import com.ecomerse.model.Rating;
import com.ecomerse.model.User;
import com.ecomerse.repository.RatingRepository;
import com.ecomerse.request.RatingRequest;
import com.ecomerse.service.ProductService;
import com.ecomerse.service.RatingService;
@Service
public class RatingServiceImplemetation implements RatingService{

	@Autowired
	private RatingRepository ratingRepository;
	
	@Autowired
	private ProductService productService;
	
	
	public Rating createRating(RatingRequest req, User user) throws ProductException {
		
		Product product = productService.findProductById(req.getProductId());
		Rating rating = new Rating();
		rating.setProduct(product);
		rating.setUser(user);
		rating.setRating(req.getRating());
		rating.setCreateAt(LocalDateTime.now());
		
		return ratingRepository.save(rating);
	}

	public List<Rating> getProductsRating(Long productId) {
		
		
		return ratingRepository.getAllProductRating(productId) ;
	}

}
