package com.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.entities.MotorCycle;
import com.restapi.service.MotorCycleRespository;

import jakarta.websocket.server.PathParam;


@RestController
public class MotorCycleController {

	@Autowired
	private MotorCycleRespository cycleRespository;
	
	@PostMapping("/addMotor")
	public MotorCycle addMotor(@RequestBody MotorCycle motorCycle) {
		
		return	this.cycleRespository.save(motorCycle);
		}
	
	@GetMapping("/getMotor")
	public List<MotorCycle> getMotor(){
		return this.cycleRespository.findAll();
	}
	
	@PutMapping("/updateMotor/{motor_id}")
	public MotorCycle updateMotor(@RequestBody MotorCycle motorCycle, @PathVariable("motor_id") int motor_id ) {
		motorCycle.setMotor_id(motor_id);
		return this.cycleRespository.save(motorCycle);
		
	}
	
	@DeleteMapping("/deleteMotor/{motor_id}")
	public void deleteMotor(@PathVariable("motor_id")int motor_id) {
		this.cycleRespository.deleteById(motor_id);
	}
	
}
