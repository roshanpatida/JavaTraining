/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section4_Anonymousinnerclassesandlambdaexpression;

/**
 *
 * @author roshan_patidar
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class AnnonymousInnerWithLambda {
    
        public static void main(String[] args) {
            Runnable r = ()->{
                    for(int i = 0;i<10;i++){
                        System.out.println("Child  thread");
                    }
                
                // Annonymous inner class With lambda 
            };
            Thread t = new Thread(r);
            t.start();
            for(int i = 0;i<10;i++){
                System.out.println("main thread");
            }
                    
        }
    }

