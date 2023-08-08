/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section1_LambdaExpressionDemo;

/**
 *
 * @author roshan_patidar
 */
class MyRunnable implements Runnable{
    @Override
    public void run(){
    for(int i=0;i<10;i++){
        System.out.println("child thread");
    }
    }
}
public class ThreadWithoutLambda {
    public static void main(String[] args) {
        
    
    Runnable r=new MyRunnable();
    Thread t = new Thread(r);
    t.start();
    for(int i=0;i<10;i++){
            System.out.println(" main thread");}
    
    }            }
