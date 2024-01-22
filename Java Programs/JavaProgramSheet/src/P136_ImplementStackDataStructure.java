public class P136_ImplementStackDataStructure {
	
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        private Node head;

        public boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }

        public int pop() {
            if (isEmpty()) {
                return -1; // or throw an exception
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                return -1; // or throw an exception
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(23);
        s.push(32);
        s.push(42);
        s.push(31);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}