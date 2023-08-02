/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25_collection.com;

import java.util.PriorityQueue;

/**
 *
 * @author roshan_patidar
 */
public class PriorityQueueDefault {
    




    public static void main(String[] args) 
    {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        // by default the proirityqueue having the high prority of small elements
        //priorityqueue is work as heap in binary
        // iserting and deleting the elements based on the priority.
        p.add(20);
        p.add(10);
        p.add(30);
        p.add(5);
        p.add(15);
        p.add(3);
        
//        System.out.println(p.peek());
        System.out.println(p);
        
        p.forEach((x)->System.out.println(x));
        
        p.poll();
        
        System.out.println("After Deletion");
        p.forEach((x)->System.out.println(x));
        
    }    
}