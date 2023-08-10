/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section2lambdaexpressionwithcollection;

/**
 *
 * @author roshan_patidar
 */

    interface Test{
        public void m1();
        
      
   
    }

public class InnerClassWithoutLambda {
    int x=888;
    public void m2(){
    Test i = new Test(){
        int x=999;
        public void m1(){
            System.out.println(this.x);
        }
        // in the inner class contains only inner class instance
        // but in the Lambda contains the outer class objects 
   };
    i.m1();
    }
    public static void main(String[] args) {
        InnerClassWithoutLambda s=new InnerClassWithoutLambda();
        s.m2();
    }
    
}
// Lambda Expression can't access  Concrete class and abstract class, multiple abstract method.
