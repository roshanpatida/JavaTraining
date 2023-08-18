/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section_7_predefinedemo;
import java.util.function.Function;
        
import java.util.*;


class Employee
 {
String name;
double salary;
Employee(String name,double salary)
{
this.name=name;
 this.salary=salary;
 }
 public String toString()
 {
return name+":"+salary;
 }
 }
class FindTotalMonthlySalary
{
public static void main(String[] args)
 {
ArrayList<Employee> l= new ArrayList<Employee>();
 populate(l);
 System.out.println(l);
Function<ArrayList<Employee>,Double> f= l1 ->{
double total=0;
for(Employee e: l1)
{
total=total+e.salary;
}
return total;
 };
System.out.println("The total salary of this month:"+f.apply(l));

 public static void populate(ArrayList<Employee> l)
{
l.add(new Employee("Sunny",1000));
 l.add(new Employee("Bunny",2000));
 l.add(new Employee("Chinny",3000));
 l.add(new Employee("Pinny",4000));
l.add(new Employee("Vinny",5000));
 }
} 