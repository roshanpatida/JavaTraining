/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singly_linkedList_section_8;

/**
 *
 * @author roshan_patidar
 */
public class RemoveFirstMethodLinkedList {
    
    Node head;
   private int size;
RemoveFirstMethodLinkedList(){
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

// RemoveFirst Method 
public void removeFirst(){
if(head == null){
            System.out.println("Empty List, nothing to delete");
            return;
}
head = this.head.next;
size--;
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
 n.removeFirst();
 n.printList();
 
}
}

