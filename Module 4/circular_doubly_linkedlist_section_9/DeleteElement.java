/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circular_doubly_linkedlist_section_9;

/**
 *
 * @author roshan_patidar
 */
public class DeleteElement {
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

  // Delete Method

  public void deleteNode(int location) {
    if (head == null) {
      System.out.println("The CSLL does not exist! ");
      return;
    } else if (location == 0) {
      head = head.next;
      tail.next = head;
      size--;
      if (size == 0) {
        tail = null;
        head.next = null;
        head = null;
      }
    } else if (location >= size) {
      Node tempNode = head;
      for (int i =0; i<size-1; i++) {
        tempNode = tempNode.next;
      }
      if (tempNode == head) {
        head.next = null;
        tail = head = null;
        size--;
        return;
      }
      tempNode.next = head;
      tail = tempNode;
      size--;
    } else {
      Node tempNode = head;
      for (int i=0; i < location-1; i++) {
        tempNode = tempNode.next;
      }
      tempNode.next = tempNode.next.next;
      size--;
    }
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
        DeleteElement csll = new DeleteElement();
         csll.createCSLL(5);
    csll.insertCSLL(4, 0);
    csll.insertCSLL(6, 1);
    csll.insertCSLL(7, 8);
csll.deleteNode(0);

    csll.traverseCSLL();
    }
 
}
