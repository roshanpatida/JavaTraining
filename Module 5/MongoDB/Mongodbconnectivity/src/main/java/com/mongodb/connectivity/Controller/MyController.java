package com.mongodb.connectivity.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.connectivity.Entity.Student;
import com.mongodb.connectivity.Repository.Repository;

@RestController

@RequestMapping("/student")
public class MyController {

	@Autowired
	private Repository repository;

	@PostMapping("/add")
	public ResponseEntity<?> addStudents(@RequestBody Student student) {
		Student save = this.repository.save(student);
		return ResponseEntity.ok(save);
	}

	@GetMapping("/get")
	public ResponseEntity<?> getStudents() {
		return ResponseEntity.ok(repository.findAll());

	}

	@DeleteMapping("/delete/{studentId}")
	public void deleteStudent(@RequestBody Student studentId) {
		this.repository.delete(studentId);

	}
    @PutMapping("/update/{id}")
	public void updateStudent(@PathVariable("id") int id, @RequestBody Student student) {
		student.setId(id); // it just set data from student to the mentioned id.
		this.repository.save(student);
	}

}
