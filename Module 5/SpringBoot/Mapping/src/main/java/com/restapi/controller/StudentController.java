package com.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.restapi.Services.StudentService;
import com.restapi.entities.Student;
import com.restapi.service.StudentRepository;

import jakarta.websocket.server.PathParam;

@RestController
public class StudentController{
	
	@Autowired
	private StudentRepository jpaRepositoty;
	
	
	
// we can use Service classes for business logics but here we use jpaRespo so we fetch the method of 
// jpa and use direclty in jpa method which is provided the crud operation and if we want perform other operation so we can create the
	// method in service class and use their business logic in this class which is created by owned.
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student emStud){
		Student add= this.jpaRepositoty.save(emStud);
		return add;
	}

    @GetMapping("/getStudent")
    public List<Student> getStudent(){
    return this.jpaRepositoty.findAll();
        
    }
    
    @PutMapping("/updateStudent/{student_id}")
    public Student updateStudent(@RequestBody Student student, @PathVariable("student_id") int studentId ) {
    	student.setStudent_id(studentId);
    	Student stu = this.jpaRepositoty.save(student);
    	return stu;
    }
    
    @DeleteMapping("/deleteStudent/{student_id}")
    public void  deleteStudent(@PathVariable ("student_id") int student_id) {
    	 this.jpaRepositoty.deleteById(student_id);
    	
    }
    
    
   
}