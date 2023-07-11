/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section19multithreading;

/**
 *
 * @author roshan_patidar
 */
class MyThread extends Thread{
    @Override
    public void run(){
        int i =1;
        while(true){
            System.out.println( i+ "Hello");
            i++;
        }
    }
  
  
}
  class  UsingMultipleClass {        
     public static void main(String[] args){


 
         MyThread s = new MyThread();
         s.start();
         int i =1;
         while(true){
             System.out.println(i +"world");
             i++;
         }
     }
    
}
