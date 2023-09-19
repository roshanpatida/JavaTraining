/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singly_linkedList_section_8;

/**
 *
 * @author roshan_patidar
 */
public class RemoveLastNode {
  
    Node head;
   private int size;
RemoveLastNode(){
    size=0;
    
} 

public class Node{
    String data;
    Node next;
    Node(String data){
        this.data=data;
        this.next=null;
        size++;
    }
}

public void removeLast(){
    if(head == null){
        System.out.println("Empty List , we are not able to delete anything");
        return;
        
    }
    size--;
    if(head.next==null){
        head = null;
        return;
    }
    Node currNode = head;
    Node lastNode = head.next;
    
    while(lastNode.next != null){
        currNode = currNode.next;
        lastNode = lastNode.next;
         
    }
    currNode.next=null;
    
}

public void addFirst(String data){
    Node newNode =new Node(data);
    newNode.next=head;
    head =newNode;
}

public void printList(){
    Node currNode = head;
    while(currNode != null){
        System.out.print(currNode.data+ "->");
        currNode=currNode.next;
    }
    System.out.print("null");
}
public static void main(String[] args){
    LL n =new LL();
    n.addFirst("E");
    n.addFirst("D");
    n.addFirst("C");
    n.addFirst("B");
    n.addFirst("A");
 n.removeLast();
 n.printList();
}
}
