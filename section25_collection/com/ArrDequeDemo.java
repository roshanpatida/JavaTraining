/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25_collection.com;

/**
 *
 * @author roshan_patidar
 */


import java.util.*;

public class ArrDequeDemo 
{   
    public static void main(String[] args) 
    {
         ArrayDeque<Integer> dq=new ArrayDeque<>();
         
         dq.offerLast(10);
         dq.offerLast(20);
         dq.offerLast(30);
         dq.offerLast(40);
         
         dq.pollFirst();
         
         dq.offerLast(1);
         dq.offerLast(2);
         dq.offerLast(3);
         dq.offerLast(4);
         System.out.println(dq);
         dq.forEach((x)->System.out.println(x));
         
    }    
}
