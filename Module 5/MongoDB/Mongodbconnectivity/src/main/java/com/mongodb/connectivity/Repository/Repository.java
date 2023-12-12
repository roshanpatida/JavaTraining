package com.mongodb.connectivity.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.mongodb.connectivity.Entity.Student;

@org.springframework.stereotype.Repository
public interface Repository extends MongoRepository<Student, Integer> {

}
