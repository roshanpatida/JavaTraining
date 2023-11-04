package com.spring.javaconfig;

public class Student {
	private Samosaa samosaa;
public Samosaa getSamosaa() {
		return samosaa;
	}
	public void setSamosaa(Samosaa samosaa) {
		this.samosaa = samosaa;
	}
	
public Student(Samosaa samosaa) {
		super();
		this.samosaa = samosaa;
	}
public void study() {

this.samosaa.display();
	System.out.println("Student is studying ");
}

}
