  package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.FileUpload.FileUploadController;

@RestController
public class controllerClass {
	@Autowired
	private FileUploadController fileUploadController;

	@PostMapping("/addFile")
	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
		try {
			if (file.isEmpty()) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("File is Emplty");
			}

			if (file.getContentType().equals("images/jpeg")) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Not a preferred type");

			}

			boolean f = fileUploadController.uploadFile(file);
			if (f) {

				// return ResponseEntity.ok("File uploaded Successfully"); //for static path
				return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/Images/")
						.path(file.getOriginalFilename()).toUriString());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong..!");

	}
	
}
