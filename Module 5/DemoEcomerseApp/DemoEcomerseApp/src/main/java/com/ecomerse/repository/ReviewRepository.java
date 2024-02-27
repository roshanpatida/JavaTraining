package com.ecomerse.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ecomerse.model.Rating;
import com.ecomerse.model.Review;

@Repository
public interface ReviewRepository  extends JpaRepository<Review, Long>{

	
	@Query("SELECT r From Review r Where r.product.id=:productId")
	public List<Review> getAllProductReview(@Param("productId")Long productId);

}
