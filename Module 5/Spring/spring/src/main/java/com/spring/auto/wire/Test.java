package com.spring.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/auto/wire/auto.xml");
	 Emp s1 = (Emp) context.getBean("emp1");
	  System.out.println(s1);
	
}
}
