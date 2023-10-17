package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entites.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = (StudentDao) context.getBean("studentDao");
//        Student student = new Student(2232,"Durgesh Tiwari", "Lucknow");
//        int r = studentDao.insert(student);
//        System.out.println("done" + r);
//        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go=true;
		 while(go) {
		
		System.out.println("Press 1 for add new student");
		System.out.println("Press 2 for diplay all the students");
		System.out.println("Press 3 get single student data");
		System.out.println("Press 4 for delete student");
		System.out.println("Press 5 for update student");
		System.out.println("Press 6 for exit ");

		try {
			int input = Integer.parseInt(br.readLine());
			switch (input) {
			case 1:
				// add a new student
				System.out.println("Enter user id: ");
				int uId=Integer.parseInt(br.readLine());
				 System.out.println("Enter user name");
				 String uName = br.readLine();
				 System.out.println("Enter user city");
				 String uCity = br.readLine();
				 Student s = new  Student();
				 s.setStudentId(uId);
				 s.setStudentName(uName);
				 s.setStudentCity(uCity);
				int r =  studentDao.insert(s);
				 System.out.println(r+ "Inserted Data....");
				 System.out.println("*********************************");
				 
				break;
			case 2:
                   List<Student> studentAll =  studentDao.getAllStudent();
                   
                	System.out.println(studentAll);
				// display all students
				break;

			case 3:
				System.out.println("Enter user id ");
				int userId = Integer.parseInt(br.readLine());
				Student student = studentDao.getStudent(userId);
//				System.out.println(student);
				System.out.print(" "+student.getStudentId());
				System.out.print(" "+student.getStudentName());
				System.out.println(" "+ student.getStudentCity());
				
				// get single st2udent data
				break;

			case 4:
				System.out.println("Enter user id");
				int deleteId = Integer.parseInt(br.readLine());
				
				studentDao.deleteStudent(deleteId);
				System.out.println("Deleted data successfully ..");
				// delete student
				break;
			default:
			case 5:
				System.out.println("Enter user id: ");
				int Id=Integer.parseInt(br.readLine());
				 System.out.println("Enter user name");
				 String Name = br.readLine();
				 System.out.println("Enter user city");
				 String City = br.readLine();
				 Student s1 = new  Student(Id,Name,City);
				 studentDao.updateStudent(s1);
				 System.out.println(s1+ "Inserted Data....");
				 System.out.println("*********************************");
				
				
				break;

			case 6:

				// exit
				break;
			}
		} catch (Exception e) {
			System.out.println("");
			System.out.println(e.getMessage());
		}
		// TODO: handle exception
	}}
}
