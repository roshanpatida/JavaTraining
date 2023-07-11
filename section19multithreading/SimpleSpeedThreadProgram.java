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
class MyThread15 extends Thread
{
    public MyThread15(String name){
        super(name);
        
    }
    public void run(){
        int count=1;
        while(true){
            System.out.println(count++);

    }
}
}
       
public class SimpleSpeedThreadProgram {
    public static void main(String[] args) {
        MyThread15 st = new MyThread15("My Thread");
        st.start();
        
    }
}
   

