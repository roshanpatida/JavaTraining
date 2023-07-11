/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section19multithreading;
/**
 *
 * @author roshan_patidar
 */
class MyThread17 extends Thread{
    @Override
    public void run(){
       int count =1;
       while(true){
           System.out.println(count++ +"Hello");
       }
    }
}
public class Yield {
    public static void main(String[] args) {
        MyThread17 st = new MyThread17();
        st.start();
        int count =1;
        while(true){
            System.out.println(count++ +"world");
            try{
            Thread.yield();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    
}
