/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25_collection.com;

import java.util.ArrayDeque;

/**
 *
 * @author roshan_patidar
 */
public class ArrayDequeString {





  
    public static void main(String[] args) 
    {
         ArrayDeque<String> dq=new ArrayDeque<>();
         
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
         
    }    
}

