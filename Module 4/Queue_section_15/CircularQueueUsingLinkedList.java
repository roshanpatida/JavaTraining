/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue_section_15;

/**
 *
 * @author roshan_patidar
 */

        public class CircularQueueUsingLinkedList{
            
   class Node{
       int data;
       Node next;
       Node(int data){
           this.data = data;
           next = null;
           
       }
   }
           static Node head =null;
           static Node tail = null;
           // isEmpty method implementation 
           public boolean isEmpty(){
               return head ==null & tail ==null;
           }
           
           // we can not implement isFull method in the likedList beacause linked not having any size limit.  
         
          
           // enqueue method implementation 
           
           public void add(int data){
               Node newNode = new Node(data);
               if(tail == null){
               head = tail = null;
                 
               }
               else{
               tail.next = newNode;
               tail = newNode;
           }
           }
      
        
       
           // dequeue method implementation 
           public int remove(){
               if(isEmpty()){
                   System.out.println("Circular Queue is Empty");
               }
               int front  = head.data;
               if(head ==tail){
                   tail = null;
               }
               head = head.next;
               return front;
           }
           
           // peek method implementation
           
           public int peek(){
               if(isEmpty()){
                   System.out.println("Circular Queue is already Empty ");
                   return -1;
                   
               }
               return head.data;
           }
           
       }
       
   

