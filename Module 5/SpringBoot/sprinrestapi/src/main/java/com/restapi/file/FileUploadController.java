package com.restapi.file;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
	public class FileUploadController {
		public final String uploadPath = "/home/roshan_patidar/Documents/workspace-spring-tool-suite-4-4.20.0.RELEASE/sprinrestapi/src/main/resources/static/Images";

		
//				//read
//				InputStream is =multipartFile.getInputStream();
//				byte data[]=new byte[is.available()];
//				is.read(data);
//				
//				//write
//				FileOutputStream fos = new FileOutputStream(uploadPath+File.separator+multipartFile.getOriginalFilename());
//				fos.write(data);
//				fos.flush();
//				fos.close();
//				
//				fal=true;
//			

	public boolean uploadFile(MultipartFile multipartFile) {
		// TODO Auto-generated method stub
		boolean fal = false;
		try {
			Files.copy(multipartFile.getInputStream(),
					Paths.get(uploadPath + File.separator + multipartFile.getOriginalFilename()),
					StandardCopyOption.REPLACE_EXISTING);
			fal = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return fal;
		
	}
	}
