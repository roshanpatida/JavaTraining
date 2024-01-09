package com.microservicesUserService.ExternalService;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.microservicesUserService.Entity.Rating;
import com.microservicesUserService.Entity.Rating.RatingBuilder;

import jakarta.ws.rs.DELETE;

@Service
@FeignClient(name = "RATING-SERVICE")
public interface RatingService {
// declarative approach.
	
	// get
	
	
	//put
	@PutMapping("ratings/{ratingId}") // if passing parameter are same so we not need to write parameter again with pathVariable
	public Rating updateRating(@PathVariable String ratingId,@RequestBody Rating rating );
	
	@GetMapping("/users/{userId}")
	public ResponseEntity<List<Rating>> getByUserId(@PathVariable String userId);
		
	
	@DeleteMapping("/ratings/{ratingId}")
public void deleteRating(@PathVariable String ratingId);

	@PostMapping
    public ResponseEntity<Rating> create(@RequestBody Rating rating);

    @GetMapping
    public ResponseEntity<List<Rating>> getRatings();

    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getRatingsByUserId(@PathVariable String userId);
    
    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingsByHotelId(@PathVariable String hotelId);
	
}

