package com.ecomerse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecomerse.exception.ProductException;
import com.ecomerse.exception.UserException;
import com.ecomerse.model.Review;
import com.ecomerse.model.User;
import com.ecomerse.request.ReviewRequest;
import com.ecomerse.service.ReviewService;
import com.ecomerse.service.UserService;

@RestController
@RequestMapping("api/review")
public class ReviewController {

	
	@Autowired
	private ReviewService reviewService;
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/create")
	public ResponseEntity<Review> createReview(@RequestBody ReviewRequest req,
			@RequestHeader("Authorization")String jwt)throws UserException,ProductException{
		User user = userService.findUserProfileByJwt(jwt);
		
		Review review = reviewService.createReview(req, user);
		return new ResponseEntity<Review>(review,HttpStatus.CREATED);	
	}
	
	@GetMapping("/product/{[productId}")
	public ResponseEntity<List<Review>> getproductREview(@PathVariable Long productId)throws UserException,ProductException{
		List<Review> reviews = reviewService.getAllReviewName(productId);
		
		return new ResponseEntity<>(reviews,HttpStatus.ACCEPTED);
	}
	
	
	
	
}
