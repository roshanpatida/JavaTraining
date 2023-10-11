package com.spring.stanalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	 ApplicationContext  context = new ClassPathXmlApplicationContext("com/spring/stanalone/collection/aloneconfig.xml");
	  Person p = (Person) context.getBean("emp1");
	  System.out.println(p);
	  System.out.println(p.getProperties());
}
}
