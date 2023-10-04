package com.in28minutes.spring.learnspringframework;


import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole{
	public void up() {
	    System.out.println("PacmanGame up");
	}
	public void left() {
		System.out.println("PacmanGame left");
		
	}

	public void right() {
		System.out.println("PacmanGame right");
	}

	public void dawn() {
		System.out.println("PacmanGame dawn");
		
	}
}
