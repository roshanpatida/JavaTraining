/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section10_Bifunctional_interface;

import java.util.ArrayList;
import java.util.function.Function;

/**
 *
 * @author roshan_patidar
 */

 class Student
 {
 String name;
 
    int balance;
 Student(String name,int balance)
 {
 this.name=name;
 this.balance=balance;
 }
 } 
class BankingDetails
 {
 public static void main(String[] args)
 {
 ArrayList<Student> l= new ArrayList<Student>();
 populate(l);
 Function<Student,String> f=s->{
     int balance =s.balance;
switch(balance){
            case 1000: System.out.println("your balace is 1000");
            break;
            case 2000: System.out.println("your balance is 2000");
            break;
            case 3000: System.out.println("your balance is 3000");
            break;
            case 4000: System.out.println("your balance is 4000");
            break;
            default : System.out.println("your balance is below 1000");
       }
     return "error";
    
 };
 for(Student s : l)
{
 System.out.println("Student Name:"+s.name);
 System.out.println("Student Grade:"+f.apply(s));
System.out.println();
 }
 }
 public static void populate(ArrayList<Student> l)
{
 l.add(new Student("Sunny",1000));
 l.add(new Student("Bunny",2000));
 l.add(new Student("Chinny",3000));
 l.add(new Student("Vinny",4000));
l.add(new Student("Pinny",800));
 }
 } 