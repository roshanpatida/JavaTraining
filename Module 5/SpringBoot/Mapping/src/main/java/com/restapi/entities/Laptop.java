package com.restapi.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "laptop_mapped")
public class Laptop {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String model;
	
	@OneToOne(cascade = CascadeType.ALL)
//	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_id")
	@JsonBackReference
	private Student student;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Laptop(int id, String model,Student student) {
		super();
		this.id = id;
		this.model = model;
		this.student = student;
	}
	public Laptop() {
		
	}
	
}
