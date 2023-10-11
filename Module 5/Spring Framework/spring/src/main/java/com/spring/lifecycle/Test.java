package com.spring.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
AbstractApplicationContext context =	new ClassPathXmlApplicationContext("com/spring/lifecycle/cyconfig.xml");
//Samosa s1 = (Samosa) context.getBean("s1");
//System.out.println(s1);

//registering shutdown hook
//System.out.println("+++++++++++++++++");
context.registerShutdownHook();
//
//Pepsi p1 = (Pepsi) context.getBean("p1");
//System.out.println(p1);

Example s1=(Example) context.getBean("example");
System.out.println(s1);
}
}
