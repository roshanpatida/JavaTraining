package com.rating_service.Service;

import java.util.List;

import com.rating_service.Entity.Rating;

public interface RatingService {

	// create
	Rating create(Rating rating);
	
	
	//get all
	
	List<Rating> getRating();
	
	// get all by userID
	List<Rating> getRatingByUserID(String userId);
	
	// get all by hotelId
	
	List<Rating> getRatingByHotelId(String hotelId);
} 
