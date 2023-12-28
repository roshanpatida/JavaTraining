package com.rating_service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rating_service.Entity.Rating;
import com.rating_service.Repository.RatingRepository;
import com.rating_service.Service.RatingService;

@Service
public class RatingServiceImpl implements RatingService{

	@Autowired
	private RatingRepository ratingRepository;
	@Override
	public Rating create(Rating rating) {
		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getRating() {
		return ratingRepository.findAll();
	}

	@Override
	public List<Rating> getRatingByUserID(String userId) {
	return ratingRepository.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
	return ratingRepository.findByHotelId(hotelId);
	}

}
