
public class P166_AddelementsttoaLinkedList {
 Node head;
 
 class Node{
	 String data;
	 Node next;
	 
	 public Node(String data) {
		 this.data = data;
		 this.next = null;
	 } }
	 
	 public void addfirst(String data) {
		 Node newNode = new Node(data);
		 if(head == null) {
			head = newNode;
			return;
		 }
		 newNode.next = head;
		 head = newNode;
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
		
	 
	 public static void main(String[] args) {
		 P166_AddelementsttoaLinkedList s = new P166_AddelementsttoaLinkedList();
			
			s.addfirst("hello");
			s.addfirst("hii");
		    s.addfirst("what");
		    s.addfirst("hello");
		    s.print();
	}
}
