/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singly_linkedList_section_8;

/**
 *
 * @author roshan_patidar
 */
public class AddLastElement {
       
    Node head;
   private int size;
AddLastElement(){
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

// implementation of addLast()  method

public void addLast(String data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        return;
    }
    Node lastNode = head;
    while(lastNode.next != null){
        lastNode = lastNode.next;
        
    }
    lastNode.next = newNode;    
}

public static void main(String[] args){
    LL n =new LL();
     n.addFirst("E");
    n.addFirst("D");
    n.addFirst("C");
    n.addFirst("B");
    n.addFirst("A");
 n.addLast("K");
 n.printList();
 
}
}


