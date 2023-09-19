/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circular_doubly_linkedlist_section_9;

/**
 *
 * @author roshan_patidar
 */
public class SearchElement {
           public Node head;
  public Node tail;
  public int size;
public class Node {
  public int value;
  public Node next;
}
  public Node createCSLL(int nodeValue) {
    head = new Node();
    Node node = new Node();
    node.value = nodeValue;
    node.next = node;
    head = node;
    tail = node;
    size = 1;
    return head;
  }
  
  //  Insertion Method
  public void insertCSLL(int nodeValue, int location) {
    Node node = new Node();
    node.value = nodeValue;
    if (head == null) {
      createCSLL(nodeValue);
      return;
    } else if (location == 0) {
      node.next = head;
      head = node;
      tail.next = head;
    } else if (location >= size) {
      tail.next = node;
      tail = node;
      tail.next = head;
    } else {
      Node tempNode = head;
      int index = 0;
      while (index < location-1) {
        tempNode = tempNode.next;
        index++;
      }
      node.next = tempNode.next;
      tempNode.next = node;
    }
    size++;
  }

  
  // Search Method

  public boolean searchNode(int nodeValue) {
    if (head != null) {
      Node tempNode = head;
      for(int i =0; i<size; i++) {
        if (tempNode.value == nodeValue) {
          System.out.print("Found node at location: " + i);
          return true;
        }
        tempNode = tempNode.next;
      }
    }
    System.out.println("Node not found! ");
    return false;
  }
  // Traversal Method
  public void traverseCSLL() {
    if (head != null) {
      Node tempNode = head;
      for (int i=0; i<size; i++) {
        System.out.print(tempNode.value);
        if (i != size-1) {
          System.out.print(" -> ");
        }
        tempNode = tempNode.next;
      }
      System.out.println("\n");
    } else {
      System.out.println("\nCSLL does not exist!");
    }
  }
    public static void main(String[] args) {
        SearchElement csll = new SearchElement();
         csll.createCSLL(5);
    csll.insertCSLL(4, 0);
    csll.insertCSLL(6, 1);
    csll.insertCSLL(7, 8);


    csll.traverseCSLL();
    csll.searchNode(4);
        System.out.println();
    }
 
}

