package com.restapi.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi.entities.Subject;


@Repository
public interface SubjectRespository extends JpaRepository<Subject, Integer> {

	
}
