/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section19multithreading;

/**
 *
 * @author roshan_patidar
 */
class MyThread14 extends Thread
{
    public MyThread14(String name){
        super(name);
        
    }
    public void run(){
        int count=1;
        while(true){
            System.out.println(count++);
            try{
                Thread.sleep(10);
//                Thread.sleep(1000);
                
                
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
    }
}
}
       
public class SleepBased {
    public static void main(String[] args) {
        MyThread14 st = new MyThread14("My Thread");
        st.start();
        
    }
}
   

