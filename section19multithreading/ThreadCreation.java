/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section19multithreading;

/**
 *
 * @author roshan_patidar
 */
class MyThread12 extends Thread{
    public MyThread12(String name){
        super(name);
    }
    
            
}
public class ThreadCreation {
    
    public static void main(String[] args)throws Exception {
        MyThread12 st = new MyThread12("My Thread1");
        System.out.println("Id"+st.getId() );
        System.out.println("name"+st.getName() );
        System.out.println("priority"+st.getPriority() );
       System.out.println("state"+st.getState() );
       System.out.println("alive"+st.isAlive() );
      
        
    }
}
