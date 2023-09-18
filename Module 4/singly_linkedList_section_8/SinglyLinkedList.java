/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singly_linkedList_section_8;

import org.w3c.dom.Node;



/**
 *
 * @author roshan_patidar
 */
public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;
 

  public Node createSinglyLinkedList(int nodeValue) {
    head = new Node();
    Node node = new Node();
    node.next = null;
    node.value = nodeValue;
    head = node;
    tail = node;
    size = 1;
    return head;
  }
        
}   
        
    // this is not run beacase it is not run on the perfection 

