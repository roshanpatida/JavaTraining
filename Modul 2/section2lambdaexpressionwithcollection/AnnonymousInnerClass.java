/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section2lambdaexpressionwithcollection;

/**
 *
 * @author roshan_patidar
 */
public class AnnonymousInnerClass {
    
        public static void main(String[] args) {
            Runnable r = new Runnable(){
                public void run(){
                    for(int i = 0;i<10;i++){
                        System.out.println("Child  thread");
                    }
                }
                // Annonymous inner class without lambda
            };
            Thread t = new Thread(r);
            t.start();
            for(int i = 0;i<10;i++){
                System.out.println("main thread");
            }
                    
        }
    }

