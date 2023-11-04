package com.spring.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("od")
@Scope("prototype")
public class Student {
	@Value("Roshan")
private String studentname;
	@Value("Surat")
private String city;
	@Value("#{address}")
	private List<String> address;
	
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Student [studentname=" + studentname + ", city=" + city + ", address=" + address + "]";
}
public List<String> getAddress() {
	return address;
}
public void setAddress(List<String> address) {
	this.address = address;
}


}
