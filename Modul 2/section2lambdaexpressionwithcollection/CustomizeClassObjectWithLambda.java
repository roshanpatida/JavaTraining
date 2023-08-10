/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section2lambdaexpressionwithcollection;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author roshan_patidar
 */
class Employee{
    int eno;
    String ename;
    Employee(int eno,String ename){
        this.eno=eno;
        this.ename=ename;
        
    }
    public String toStrin(){
        return eno +" "+ename;
    }
}
public class CustomizeClassObjectWithLambda {
    public static void main(String[] args) {
        
    
        ArrayList<Employee> l = new ArrayList<Employee>();
        
        l.add(new Employee(100,"Katrina")); 
        l.add(new Employee(600,"Kahd")); 
        l.add(new Employee(400,"Kathaha")); 
        l.add(new Employee(555,"lajd")); 
        l.add(new Employee(888,"ggtrina")); 
        l.add(new Employee(200,"yytrina")); 
        System.out.println("Before"+l);
        Collections.sort(l,(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0); 
         System.out.println("After" + l);
        
    }}

