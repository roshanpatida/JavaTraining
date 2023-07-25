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
public class ArrayDequeCharacter {
 


   
    public static void main(String[] args) 
    {
         ArrayDeque<Character> dq=new ArrayDeque<>();
         
         dq.offerLast('a');
         dq.offerLast('v');
         dq.offerLast('b');
         dq.offerLast('e');
         
         dq.pollFirst();
         
         dq.offerLast('t');
         dq.offerLast('s');
         dq.offerLast('g');
         dq.offerLast('q');
         System.out.println(dq);
         dq.forEach((x)->System.out.println(x));
         
    }    

}
