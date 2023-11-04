package com.restapi.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "motor_mapped")
public class MotorCycle {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int motor_id;
	private String engine;
	private String tyre;
	
	@ManyToOne(cascade = CascadeType.MERGE)// cascade is used for automaically update if we update internally.
	@JoinColumn(name = "student_id")
	@JsonBackReference
	private Student student;
	
	public MotorCycle(int motor_id, String engine, String tyre, Student student) {
		super();
		this.motor_id = motor_id;
		this.engine = engine;
		this.tyre = tyre;
		this.student = student;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public int getMotor_id() {
		return motor_id;
	}
	public void setMotor_id(int motor_id) {
		this.motor_id = motor_id;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getTyre() {
		return tyre;
	}
	public void setTyre(String tyre) {
		this.tyre = tyre;
	}
	
	public MotorCycle() {}
}
