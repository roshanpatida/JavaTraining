/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section2lambdaexpressionwithcollection;



/**
 *
 * @author roshan_patidar
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author roshan_patidar
 */

    interface Test{
        public void m1();
        
      
   
    }

public class InnerClassWithLambda {
    int x=888;
    public void m2(){
    Test i = ()->{
        int x=999;
        
            System.out.println(this.x);
        
        // In the lambda expression it contains outer class objects
        // it means it will not change the value of objects in lambda expression
        // so  clear that lambda and annonymous inner class both are diffrent between them.
   };
    i.m1();
    }
    public static void main(String[] args) {
        InnerClassWithoutLambda s=new InnerClassWithoutLambda();
        s.m2();
    }
    
}
