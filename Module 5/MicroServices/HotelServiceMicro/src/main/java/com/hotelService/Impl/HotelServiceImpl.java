package com.hotelService.Impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelService.Entity.Hotel;
import com.hotelService.Exception.ResourceNotFoundException;
import com.hotelService.Repository.HotelRepository;
import com.hotelService.Service.HotelService;


@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository hotelRepository;
	
	@Override
	public Hotel create(Hotel hotel) {
		String randomUserId = UUID.randomUUID().toString(); // generate unique useId in string form
		hotel.setId(randomUserId);
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAll() {
				
		return hotelRepository.findAll();
	}

	@Override
	public Hotel get(String id) {
		
		return hotelRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("hotel with given id not found !!"));
	}

}
