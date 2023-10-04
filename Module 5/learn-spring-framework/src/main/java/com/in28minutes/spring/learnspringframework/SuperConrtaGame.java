package com.in28minutes.spring.learnspringframework;

import org.springframework.stereotype.Component;

@Component
public class SuperConrtaGame implements GamingConsole {
	public void up() {
	    System.out.println("SuperContraGame up");
	}
	public void left() {
		System.out.println("SuperConstraGame left");
		
	}

	public void right() {
		System.out.println("SuperContraGame right");
	}

	public void dawn() {
		System.out.println("SusperContraGame dawn");
		
	}
}
