package com.hotelService.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotelService.Entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String>{
	
	//create 
Hotel create(Hotel hotel);

// get all
List<Hotel> getAll();

//get single 
Hotel get(String id);
	
}
