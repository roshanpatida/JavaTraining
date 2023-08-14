/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section6_predefined_functional_interfaces_predicate;

import java.util.Scanner;
import java.util.function.Predicate;

/**
 *
 * @author roshan_patidar
 */
class Customer{
    String name;
    int  age;
    boolean ishavingGF;
    Customer(String name,int age,boolean ishavingGF){
        this.name=name;
        this.age=age;
        this.ishavingGF=ishavingGF;
    
}
    @Override
    public String toString(){
        return name;
    }
}
public class CheckPubEntry {
    public static void main(String[] args) {
       Customer[] list={new Customer("Roshan",22,true),new Customer("Harshit",24,true),
           new Customer("Sarika",23,false), new Customer("Faisu",22,false)
           
       };
      Predicate<Customer> allowed=c->c.age>21&& c.ishavingGF==true;
      for(Customer s:list){
          if(allowed.test(s)){
              System.out.println(s);
          }
      }
        
                
    }
}
