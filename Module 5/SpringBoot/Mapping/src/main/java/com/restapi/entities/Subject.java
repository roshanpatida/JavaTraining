package com.restapi.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "subject_mapped")
public class Subject {
@Id
	private int  subject_id;
	private String name;
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ManyToMany(mappedBy = "subject" ,cascade = CascadeType.MERGE)
//	@JoinColumn(name = "student_id")
	@JsonBackReference
	private List<Student> student;

	public int getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public Subject(int subject_id, String name, List<Student> student) {
		super();
		this.subject_id = subject_id;
		this.name = name;
		this.student = student;
	}
public Subject() {
	
}
}
