

public class P165_emoveelementfromtheLinkedList {
Node head;

class Node{
	String data;
	Node next;
	
	public Node(String data) {
	this.data=  data;
	this.next  =null;
	}
}
	
	public void addfirst(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode; // corner case
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	
	
	public void removeFirst() {
		if(head  == null) {
			System.out.println("List is already empty");
			return;
		}
		head = head.next;
	}
	
	
	public void removeLast() {
		if(head == null) {
			System.out.print("empty");
			return;
		}
		if(head.next == null) {
			head = null;
			return;
		}
		
	Node secondLastNode = head;
	Node lastNode = head.next;
	while(head.next != null) {
		secondLastNode = secondLastNode.next;
		lastNode = lastNode.next;
	}
	secondLastNode.next = null;
	}

	 public void print() {
		 Node currNode = null;
		 
		if(head == null) {
			System.out.println("empty");
			return;
		}
	    while(head != null) {
	    	System.out.println(currNode.data + "->");
	    	currNode = currNode.next;
	    }
	    System.out.println("NULL");
			
	 }

	public static void main(String[] args) {
		P165_emoveelementfromtheLinkedList s = new  P165_emoveelementfromtheLinkedList();
	s.addfirst("hello");
	s.addfirst("hii");
    s.addfirst("what");
    s.addfirst("hello");
    s.print();
    s.removeFirst();
    s.print();
    s.removeLast();
    s.print();
	}


}
