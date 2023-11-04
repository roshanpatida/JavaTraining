package com.restapi.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi.entities.MotorCycle;


@Repository
public interface MotorCycleRespository  extends JpaRepository<MotorCycle, Integer>{

}
