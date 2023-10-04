package com.in28minutes.spring.learnspringframework;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole{
public void up() {
    System.out.println("up");
}


public void left() {
	System.out.println("left");
	
}

public void right() {
	System.out.println("right");
}

public void dawn() {
	System.out.println("dawn");
}

}
