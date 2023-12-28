package com.rating_service.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

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


	@Autowired
	private RatingService ratingService;
	// creare Rating 
	@PostMapping
	public ResponseEntity<Rating> createRating(@RequestBody Rating rating){
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
	}
	
	// get all
	@GetMapping
	public ResponseEntity<List<Rating>>  getRatings() {
		return ResponseEntity.ok(ratingService.getRating());
	}
	
	// getbyUserId
	@GetMapping("/users/{userId}")
	public ResponseEntity<List<Rating>> getByUserId(@PathVariable String userId){
		return ResponseEntity.ok(ratingService.getRatingByUserID(userId));
	}
	// getbyHotelId
	@GetMapping("/hotels/{hotelId}")
	public ResponseEntity<List<Rating>> getByHotelId(@PathVariable String hotelId){
		return ResponseEntity.ok(ratingService.getRatingByHotelId(hotelId));
	}
}
