package com.microservicesUserService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.microservicesUserService.Entity.Rating;
import com.microservicesUserService.Entity.Rating.RatingBuilder;
import com.microservicesUserService.ExternalService.RatingService;

@SpringBootTest
class MicroservicesApplicationTests {
	
	@Autowired
	private RatingService ratingService;

	@Test
	void contextLoads() {
	}
	
	void createRating() {  //  builder is used to make object directly.
		RatingBuilder rating = Rating.builder().rating(10).userId("").hotelId("").feedback("this it not the main faire");		
		
		Rating savedRating  =  ratingService.createRating(rating);
		
		System.out.println("----------------------------");
	}

}
