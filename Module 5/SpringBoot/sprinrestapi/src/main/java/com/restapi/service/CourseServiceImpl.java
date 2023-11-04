package com.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.repository.CourseRepository;

@Service
public class CourseServiceImpl  {
	
	@Autowired
	private CourseRepository courseRepository;
	
}
