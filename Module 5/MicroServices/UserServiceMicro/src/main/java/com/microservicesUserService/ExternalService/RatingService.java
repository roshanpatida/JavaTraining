package com.microservicesUserService.ExternalService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	
	
	//post
	@PostMapping("/ratings")
	Rating createRating(@RequestBody RatingBuilder rating); // in the parameter we can pass "map<String,Object> values" in the place of "Rating values" if we does not have user defined values. 
	
	//put
	@PutMapping("ratings/{ratingId}") // if passing parameter are same so we not need to write parameter again with pathVariable
	public Rating updateRating(@PathVariable String ratingId,@RequestBody Rating rating );
	
	
	//Delete 
	
	@DeleteMapping("/ratings/{ratingId}")
public void deleteRating(@PathVariable String ratingId);

}
