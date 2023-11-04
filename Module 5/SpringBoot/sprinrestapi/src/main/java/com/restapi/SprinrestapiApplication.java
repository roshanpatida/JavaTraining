package com.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.restapi.entities.Course;
import com.restapi.repository.CourseRepository;

import ch.qos.logback.core.Context;

@SpringBootApplication
public class SprinrestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprinrestapiApplication.class, args);
	ApplicationContext context = SpringApplication.run(SprinrestapiApplication.class, args);
	 

}}
