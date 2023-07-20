/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section22_iostreams;
import java.io.*;
/**
 *
 * @author roshan_patidar
 */
class Producer extends Thread{
    OutputStream os;
    public Producer(OutputStream o){
        os=o;
    }

    Producer(PipedOutputStream pos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
    @Override
    public void run(){
        try{
            int count=1;
            while(true){
                os.write(count);
                os.flush();
                System.out.println("Producer"+count);
                System.out.flush();
                Thread.sleep(10);
                count++;
                
            }
            
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
           
}
class Consumer extends Thread{
    InputStream is;
    public Consumer(InputStream s){
        is=s;
    }

    Consumer(PipedInputStream pis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public void run(){
        try{
           int x;
            while(true){
                x=is.read();
                
                System.out.println("Producer"+x);
                
                
                
                
            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
           
}

public class PipedStream {
    public static void main(String[] args) throws Exception {
        PipedOutputStream pos=new PipedOutputStream();
        PipedInputStream pis=new PipedInputStream();
        pos.connect(pis);
        Producer p =new Producer(pos);
        Consumer s= new Consumer(pis);
        p.start();
        s.start();
    }
    
}
