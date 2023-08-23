/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section12_method_and_constructor_reference;

/**
 *
 * @author roshan_patidar
 */
public class ThreadUsingLamda {
    public static void main(String[] args) {
        Runnable r=()->{
            for(int i =0;i<10;i++){
                System.out.println("child method");
            }
        };
        Thread t=new Thread(r);
        t.start();
        for(int i=0;i<10;i++){
            System.out.println("main thread");
        }
                
    }
}
