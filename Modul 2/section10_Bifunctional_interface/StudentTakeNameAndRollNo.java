/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section10_Bifunctional_interface;

/**
 *
 * @author roshan_patidar
 */

import java.util.function.*;
 import java.util.*;
 class Student
{
 String name;
int rollno;
 Student(String name,int rollno)
 {
 this.name=name;
 this.rollno=rollno;
 }
}
class StudentTakeNameAndRollNo
 { 
 public static void main(String[] args)
 {
 ArrayList<Student> l = new ArrayList<Student>();
 BiFunction<String,Integer,Student> f=(name,rollno)->new Student(name,rollno);

 l.add(f.apply("Durga",100));
 l.add(f.apply("Ravi",200));
 l.add(f.apply("Shiva",300));
 l.add(f.apply("Pavan",400));
 for(Student s : l)
 {
 System.out.println("Student Name:"+s.name);
 System.out.println("Student Rollno:"+s.rollno);
 System.out.println();
 }
 }
 } 
