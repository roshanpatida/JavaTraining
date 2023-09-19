
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singly_linkedList_section_8;

/**
 *
 * @author roshan_patidar
 */
class LL {
    Node head;
   private int size;
LL(){
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

// implementaion of addfirst method

public void addFirst(String data){
    Node newNode =new Node(data);
    newNode.next=head;
    head =newNode;
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
 // implemetation of print method

public void printList(){
    Node currNode = head;
    while(currNode != null){
        System.out.println(currNode.data+ "->");
        currNode=currNode.next;
    }
    System.out.println("null");
}
// removeFirst method implementation 

public void removeFirst(){
if(head == null){
            System.out.println("Empty List, nothing to delete");
            return;
}
head = this.head.next;
size--;
}
// remove last method implementation 

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

// implement size() method 

public int getSize(){
    return size;
}
public static void main(String args[]){
    LL list = new LL();
    list.addFirst("is");
    list.printList();
    list.addLast("The");
    list.printList();
    list.getSize();
    list.printList();
    list.addFirst("is");
    list.addFirst("this");
    list.addFirst("or");
    list.addFirst("more");
    list.addFirst("hello");
    list.removeFirst();
    list.printList();
    list.removeLast();
    list.printList();
    list.removeFirst();
    list.printList();
}

}