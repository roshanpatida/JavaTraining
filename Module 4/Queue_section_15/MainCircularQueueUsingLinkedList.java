/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue_section_15;

/**
 *
 * @author roshan_patidar
 */
public class MainCircularQueueUsingLinkedList {
    public static void main(String[] args) {
        
    
  CircularQueueUsingLinkedList sc = new  CircularQueueUsingLinkedList();
          System.out.println(sc.isEmpty());

  sc.add(1);
  sc.add(2);
  sc.add(3);
        System.out.println(sc.peek());
        System.out.println( sc.remove());
  
    }
}
