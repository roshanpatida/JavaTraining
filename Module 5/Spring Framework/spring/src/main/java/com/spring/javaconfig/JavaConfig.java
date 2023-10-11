package com.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.lifecycle.Samosa;

@Configuration
//@ComponentScan(basePackages="com.spring.javaconfig")
public class JavaConfig {
//	
	@Bean
	public Samosaa getSamosa() {
		return new Samosaa();
	}
//	private Samosa samosa;
//	public JavaConfig(Samosa samosa) {
//		super();
//		this.samosa = samosa;
//	}
//	public Samosa getSamosa() {
//		return samosa;
//	}
//	public void setSamosa(Samosa samosa) {
//		this.samosa = samosa;
//	}
	@Bean  // ite define the bean it mean IOC container understand the tag that this method name is bean name 
public Student getStudent() {
	
	// create a new student object 
	Student student = new Student(getSamosa() );
	return student;
}
}
