package com.hotelService.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelService.Entity.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, String>{
	

}
