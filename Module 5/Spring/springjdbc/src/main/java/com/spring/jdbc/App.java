package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.SystemPropertyUtils;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("My program started");
    	//THIS IS FOR .XML FILE 
//    	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/aloneconfig.xml");
    	
    	
    	//THIS IS USED IN WITHOUT XML FILE
    	ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
   StudentDao  studentDao=  context.getBean("studentDao",StudentDao.class);
   
   // INTERT QUERY 
//Student student = new Student();
//
//    	student.setId(777);
//    	student.setName("Abhigyan");
//    	student.setCity("Indore");
//    	
//    	int result = studentDao.insert(student);
//     System.out.println("Student added" + result);
////        
//    	
//    
   // UPDATE QUERY
//   Student student=new Student();
//   student.setId(222);
//   student.setName("Kuldeep Patidar");
//   student.setCity("Maheshwar");
//   int result = studentDao.change(student);
//   System.out.println("Updated .."+ result);
   
   //DELETE QUERY
//   
//  int result = studentDao.delete(222);
//  System.out.println("Delete data successfully >>" + result);
// 
   
   
   //SINGLE DATA 
//Student student = studentDao.getStudent(444);
//System.out.println(student);

   
   //MULTIPLE DATA / ROWS 
   List<Student> students= studentDao.getAllStudents();
   for(Student s : students) {
	   System.out.println(s);
	   
   }
    }
}
