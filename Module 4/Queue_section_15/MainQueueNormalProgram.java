/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue_section_15;

/**
 *
 * @author roshan_patidar
 */
public class MainQueueNormalProgram {
    public static void main(String[] args) {
        
    
   QueueNormalProgram sc= new QueueNormalProgram(4);
        System.out.println("Queue is  Full : " + sc.isFull());
        System.out.println("Queue is Empty : "+sc.isEmpty());
        sc.enQueue(2);
        sc.enQueue(3);
        sc.enQueue(4);
        sc.enQueue(5);
        sc.enQueue(6);
        

        System.out.println(sc.deQueue());
        System.out.println(sc.deQueue());
        System.out.println(sc.deQueue());
        System.out.println(sc.deQueue());
        
        // now queue  is Empty os it will return -1.
        System.out.println(sc.deQueue());
        
        System.out.println(sc.deQueue());
        System.out.println(sc.peek());
     sc.deDelete();
    }
}
