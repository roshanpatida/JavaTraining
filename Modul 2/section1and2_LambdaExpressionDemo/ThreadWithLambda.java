/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section1and2_LambdaExpressionDemo;

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

public class ThreadWithLambda {
    public static void main(String[] args) {
        
    Runnable r=()->{
            for(int i=0;i<10;i++){
                System.out.println("child thread");
            }   };
      // anonymous function 
    Thread t = new Thread(r);
    t.start();
    for(int i=0;i<10;i++){
            System.out.println(" main thread");}
    
    }            }
