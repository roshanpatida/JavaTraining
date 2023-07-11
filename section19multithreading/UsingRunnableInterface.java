/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section19multithreading;

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
class MyThread1 implements Runnable{
    @Override
    public void run(){
        int i =1;
        while(true){
            System.out.println( i+ "Hello");
            i++;
        }
    }
  
  
}
  class  UsingRunnableInterface {        
     public static void main(String[] args){


 
         MyThread1 s1 = new MyThread1();
         Thread s = new Thread();
                 
         s.start();
         int i =1;
         while(true){
             System.out.println(i +"world");
             i++;
         }
     }
    
}
