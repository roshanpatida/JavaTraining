/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section12_method_and_constructor_reference;

/**
 *
 * @author roshan_patidar
 */
public class ThreadUsingReferenceMethod {
  public void m1(){
      for(int i=0;i<10;i++){
          System.out.println("child thread");
      }
          
  }  
    public static void main(String[] args) {
        ThreadUsingReferenceMethod t=new ThreadUsingReferenceMethod();
        Runnable r=t::m1;
        Thread t1=new Thread(r);
        t1.start();
        for(int i=0;i<10;i++){
             System.out.println("main thread");
        }
    }
}
