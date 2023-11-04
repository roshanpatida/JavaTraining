package com.example.demo.FileUpload;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadController {
//		public final String uploadPath = "/home/roshan_patidar/Documents/workspace-spring-tool-suite-4-4.20.0.RELEASE/springbootjpa/src/main/resources/static/Images";
		
	public final String uploadPath = new ClassPathResource("static/Images/").getFile().getAbsolutePath();
private ClassPathResource multipartFile;
	public FileUploadController()throws IOException 
	{
		
	}
//	
//	public boolean uploadFile(MultipartFile multipartFile) {
//		boolean f = false;
//		try {
//			
//		}
//		}
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
			

	public boolean uploadFile(MultipartFile multipartFile) {
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
