
public class P135_ImplementLinkedList {
	Node head;

	P135_ImplementLinkedList() {
		this.head = null;
	}

	class Node {
		String data;
		Node next;

		public Node(String data) {
			this.data = data;
			this.next = null;
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

	public void addLast(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}

		Node currNode = head;
		while (currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}

	public void print() {
		if (head == null) {
			System.out.println("empty");
			return;
		}
		Node currNode = head;
		while (currNode != null) {

			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}
		System.out.println("NULL");
		}
	
	public void firstdelete() {
		if(head == null){
			System.out.println("empty list");
			return;
		}
		head = head.next;
	}

	public void lastDelete() {
		if(head== null) {
		System.out.println("empty list");
		return;
		}
		if(head.next == null) {
			head = null;
			return;
		}
		
		Node secondLastNode = head;
		Node lastNode = head.next;
		while(lastNode.next != null ) {
			lastNode = lastNode.next;
			secondLastNode = secondLastNode.next;
		}
		secondLastNode.next = null;
	}
	
	
	public static void main(String[] args) {
		P135_ImplementLinkedList l = new P135_ImplementLinkedList();
		l.addfirst("hello");
		l.addfirst("hii");
		l.addfirst("hello");
		l.print();
		l.addLast("hu");
		l.print();
		l.firstdelete();
		l.print();
		l.lastDelete();
		l.print();
		
	}
}
