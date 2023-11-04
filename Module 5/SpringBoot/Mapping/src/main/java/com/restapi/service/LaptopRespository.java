package com.restapi.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi.entities.Laptop;

@Repository
public interface LaptopRespository  extends JpaRepository<Laptop, Integer>{

}
