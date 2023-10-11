package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Hi");
       ApplicationContext context =  new ClassPathXmlApplicationContext("com/spring/Config.xml");
       // IOC container create the object automatically and fetch data from config file and after use it will deleted also.
       // we can change the data through XML file it mean we not need to change in java file and not intersect from compilation problem 
      Student student1 = (Student) context.getBean("student1");
      Student student2 = (Student) context.getBean("student2");
      System.out.println(student1);   
      System.out.println(student2);
    }
}
