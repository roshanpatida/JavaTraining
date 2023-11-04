package com.spring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {
public static void main(String[] args) {
  ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
 
 Student student = (Student) context.getBean("getStudent");
 System.out.println(student);
 student.study();
}
}
