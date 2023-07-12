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
class MyThread18 extends Thread{
    @Override
    public void run(){
       int count =1;
       while(true){
           System.out.println(count++ );
           try{
               Thread.sleep(1000);
           }
           catch(InterruptedException e){
               System.out.println(e);}
       }
    }
}
public class InterruptMethod {
    public static void main(String[] args) {
        MyThread18 st = new MyThread18();
        st.start();
        st.interrupt(); // it will be print at once only because i call only on time 
                    }
        }
    
    

