/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25_collection.com;

import java.util.ArrayDeque;
import java.util.List;

/**
 *
 * @author roshan_patidar
 */
public class ArrayDequeString {





  
    public static void main(String[] args) 
    {
         ArrayDeque<String> dq=new ArrayDeque<>();
         ArrayDeque<String> dq1=new ArrayDeque<>(List.of("hekllo","hello","roshan"));
         
         
         dq.offerLast("hello");
         dq.offerLast("hdh");
         dq.offerLast("roshan");
         dq.offerLast("harshit");
         
         dq.pollFirst();
         
         dq.offerLast("patidar");
         dq.offerLast("ranawat");
         dq.offerLast("sarathe");
         dq.offerLast("yadav");
         
         dq.forEach((x)->System.out.println(x));
         dq.add("hhhoh");
         System.out.println(dq);
         dq.retainAll(dq1); // print only matched elements 
         System.out.println(dq);
         dq.removeAll(dq1);// remove similer elements which is present in both list
         System.out.println(dq);
                 
    }    
}

