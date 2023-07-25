/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25_collection.com;

import java.util.LinkedList;

/**
 *
 * @author roshan_patidar
 */
public class LinkedListLogic {
    public static void main(String[] args) {
       LinkedList<Integer> sc= new LinkedList<>();
       for(int i=0;i<20;i++)
       {
           sc.add(i, i*2);
       }
        System.out.println(sc);
        
        
        System.out.println("----------------------");
        sc.add(20);
        
        System.out.println(sc.peek());
        
        
        
    }
}
