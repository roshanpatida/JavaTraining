package com.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.entities.Laptop;
import com.restapi.entities.Student;
import com.restapi.service.LaptopRespository;

@RestController
public class LaptopController {

	@Autowired
	private LaptopRespository laptopRepo;
	
	
@PostMapping("/addlap")
	public Laptop addlap(@RequestBody Laptop lap) {
	Laptop add1= this.laptopRepo.save(lap);
	return add1;
	
	}			
	    @GetMapping("/getLaptop")
	    public List<Laptop> getlap(){
	        return laptopRepo.findAll();
	    }
	    
	  
}

