package com.mongodb.connectivity.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongodb.connectivity.Entity.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, Integer> {

}
