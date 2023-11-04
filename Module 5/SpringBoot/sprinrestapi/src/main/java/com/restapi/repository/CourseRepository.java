package com.restapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.restapi.entities.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer> {
	
}
