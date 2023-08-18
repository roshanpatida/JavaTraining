import java.util.function.*;
 import java.util.*;
 class Student
 {
 String name;
 int marks;
 Student(String name,int marks)
 {
 this.name=name;
 this.marks=marks;
 }
 } 
class Find_Student_Grade
 {
 public static void main(String[] args)
 {
 ArrayList<Student> l= new ArrayList<Student>();
 populate(l);
 Function<Student,String> f=s->{
 int marks=s.marks;
 if(marks>=80)
 {
 return "A[Dictinction]";
 }
 else if(marks>=60)
 {
return "B[First Class]";
 }
 else if(marks>=50)
 {
 return "C[Second Class]";
 }
 else if(marks>=35)
{
return "D[Third Class]";
 }
 else
 {
 return "E[Failed]";
 }
 };
 for(Student s : l)
{
 System.out.println("Student Name:"+s.name);
 System.out.println("Student Marks:"+s.marks);
 System.out.println("Student Grade:"+f.apply(s));
System.out.println();
 }
 }
 public static void populate(ArrayList<Student> l)
{
 l.add(new Student("Sunny",100));
 l.add(new Student("Bunny",65));
 l.add(new Student("Chinny",55));
 l.add(new Student("Vinny",45));
l.add(new Student("Pinny",25));
 }
 } 