package com.rating_service.Controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rating_service.Entity.Rating;
import com.rating_service.Service.RatingService;

@RestController
@RequestMapping("/ratings")

public class RatingController {

	private static final Logger logger = LoggerFactory.getLogger(RatingController.class);

	@Autowired
	private RatingService ratingService;
	// creare Rating 
	@PostMapping
	public ResponseEntity<Rating> createRating(@RequestBody Rating rating){
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
	}
	
	// get all
	@PreAuthorize("hasAuthority('SCOPE_internal') || hasAuthority('Admin')")
	@GetMapping
	public ResponseEntity<List<Rating>>  getRatings() {
		return ResponseEntity.ok(ratingService.getRating());
	}
	
	// getbyUserId
	@GetMapping("/users/{userId}")
	@PreAuthorize("hasAuthority('SCOPE_internal') || hasAuthority('Admin')") // can access admin and user
	public ResponseEntity<List<Rating>> getByUserId(@PathVariable String userId){
		logger.info(" called ratings by userId : Rating Contoller");
		return ResponseEntity.ok(ratingService.getRatingByUserID(userId));
	}
	// getbyHotelId
	@GetMapping("/hotels/{hotelId}")
	public ResponseEntity<List<Rating>> getByHotelId(@PathVariable String hotelId){
		return ResponseEntity.ok(ratingService.getRatingByHotelId(hotelId));
	}
}

