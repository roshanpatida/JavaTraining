/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section19multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author roshan_patidar
 */
class MyThread16 extends Thread{
    @Override
    public void run(){
        int count=1;
        while(true){
            System.out.println(count++);
            
        }
    }
}
public class SetDaemon {
    public static void main(String[] args) {
        MyThread16 st =new MyThread16();
        Thread mainthread = Thread.currentThread();
               
        st.setDaemon( true);
        st.start();
        try {
            mainthread.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(SetDaemon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
