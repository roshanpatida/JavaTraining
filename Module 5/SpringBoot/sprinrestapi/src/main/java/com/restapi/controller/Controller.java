package com.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.restapi.entities.Course;
import com.restapi.file.FileUploadController;
import com.restapi.service.CourseServiceImpl;

@RestController // send data in the form of json and XML but basacally send the data as a json.
public class Controller {

	@Autowired
	private CourseServiceImpl courseService;
	
	@Autowired
	private FileUploadController fileUploadController;

	@GetMapping("/home")
	public String home() {
		return "this is home page"; 
	}
	
	
	@PostMapping("/addFile")
	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
		try {
			if (file.isEmpty()) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("File is Emplty");
			}

			if (!file.getContentType().equals("image/jpeg")) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Not a preferred type");

			}

			boolean f = fileUploadController.uploadFile(file);
			if (f) {

				// return ResponseEntity.ok("File uploaded Successfully"); //for static path
				return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/image/")
						.path(file.getOriginalFilename()).toUriString());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong..!");

	}
	
	

//	// get the courses
//	@GetMapping("/courses")
//	public List<Course> getCourses() {
//		return this.courseService.getCourses(); // Course will passed data
//	}
//
//	@GetMapping("/courses/{courseId}")
//		public Course getCourse(@PathVariable String courseId) {
//		return this.courseService.getCourse(Long.parseLong(courseId));
//		
//		}
//     @PostMapping("/courses")// data will came in the form of json 
//	public Course addCourse(@RequestBody Course course) {
//		return this.courseService.addCourse(course) ;
//		
//	}
//     @DeleteMapping("/courses/{courseId}")
//     public Course deleteCourse(@PathVariable("courseId") int courseId) {
//    	 return this.courseService.deleteCourse(courseId);
//     }
//    
//     @PutMapping("/courses/{courseId}")
//    public Course updateCourse(@PathVariable("courseId") int courseId) {
//    return this.courseService.updateCourse(courseId);
//}
}