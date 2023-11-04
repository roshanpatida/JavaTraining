package com.spring.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/stereotype/stereotype.xml");
	Student s = (Student) context.getBean("od");
	System.out.println(s.hashCode());
	System.out.println(s.getAddress().getClass());
	
	Student s1 = (Student) context.getBean("od");
	System.out.println(s1.hashCode());
	
	
}
}
