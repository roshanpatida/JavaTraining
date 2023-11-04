package com.restapi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.restapi.entities.Student;
import com.restapi.service.StudentRepository;

public class StudentService {

	@Autowired
	private StudentRepository jpaRepositoty;
	
	
	//add Student
	
	public Student addStudent(@RequestBody Student student) {
	Student st = 	this.jpaRepositoty.save(student);
		return st;
	}
	
	//get all student
	public List<Student> getStudent(){
		return this.jpaRepositoty.findAll();
	}
	
	
	//update Student
	public Student updateStudent(Student student, int student_id ) {
		student.setStudent_id(student_id);
		Student stud =this.jpaRepositoty.save(student);
		System.out.println("data us updated successfully....");
		return stud;
		
	}
	
	// Delete Student
	public void deleteStudent(Student student,int student_id) {
  student.setStudent_id(student_id);
  this.jpaRepositoty.deleteById(student_id);
	
	}
	
	
	
}
