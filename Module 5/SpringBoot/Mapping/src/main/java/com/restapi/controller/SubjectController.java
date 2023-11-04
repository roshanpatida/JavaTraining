package com.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.entities.Subject;
import com.restapi.service.SubjectRespository;

@RestController
public class SubjectController {

	@Autowired
	private SubjectRespository respository;

	@PostMapping("/addSubject")
	public Subject addSubject(@RequestBody Subject subject) {
		return this.respository.save(subject);

	}

	@GetMapping("/getSubject")
	public List<Subject> getSubject(@RequestBody Subject subject) {
		return this.respository.findAll();
	}

	@PutMapping("/updateSubject/{subject_id}")
	public Subject updateSubject(@RequestBody Subject subject, @PathVariable("subject_id") int subject_id) {
		subject.setSubject_id(subject_id);
		return this.respository.save(subject);
	}

	@DeleteMapping("/deleteSubject/{subject_id}")
	public void deleteSubject(@PathVariable("subject_id") int subject_id) {
		this.respository.deleteById(subject_id);
	}

}
