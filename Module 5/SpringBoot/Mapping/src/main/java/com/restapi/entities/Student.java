package com.restapi.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;



@Entity
@Table(name="student_mappped")

public class Student {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int student_id;
	private String name;
	private String about;
	
	@OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
//	@OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
	private Laptop laptop;

	@OneToMany(mappedBy =  "student",cascade = CascadeType.ALL)
	private List<MotorCycle> motorcycle;
	
	
	@ManyToMany
	private List<Subject> subject;
	
	
	public Student(int student_id, String name, String about, Laptop laptop, List<MotorCycle> motorcycle,
			List<Subject> subject) {
		super();
		this.student_id = student_id;
		this.name = name;
		this.about = about;
		this.laptop = laptop;
		this.motorcycle = motorcycle;
		this.subject = subject;
	}

	public List<Subject> getSubject() {
		return subject;
	}

	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}

	public List<MotorCycle> getMotorcycle() {
		return motorcycle;
	}

	public void setMotorcycle(List<MotorCycle> motorcycle) {
		this.motorcycle = motorcycle;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	
	// it for oneToOne mapping 
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
//

	public Student() {
		
	}
//	
}
