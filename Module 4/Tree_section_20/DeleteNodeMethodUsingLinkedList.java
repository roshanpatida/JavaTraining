/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tree_section_20;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author roshan_patidar
 */
public class DeleteNodeMethodUsingLinkedList {

    BinaryNode root;

    public DeleteNodeMethodUsingLinkedList() {
        this.root = null;
    }

    static class BinaryNode {

        public String value;
        public BinaryNode left;
        public BinaryNode right;
        public int height;

    }

    // get Deepest Node 
    public BinaryNode getDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode presentNode = null;
        while (!queue.isEmpty()) {
            presentNode = queue.remove();
            if (presentNode.left != null) {
                queue.add(presentNode.left);

            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);

            }
        }
        return presentNode;
    }

    // Delete Deepest Node 
    public void deleteDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode previousNode, presentNode = null;
        while (!queue.isEmpty()) {
            previousNode = presentNode;
            presentNode = queue.remove();
            if (presentNode.left == null) {
                presentNode.right = null;
                return;
            } else if (presentNode.right == null) {
                presentNode.left = null;
            }

            queue.add(presentNode.left);
            queue.add(presentNode.right);

        }
    }
    // Delete Given Node

    void deleteNode(String value) {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.value == value) {
                presentNode.value = getDeepestNode().value;
                deleteDeepestNode();
                System.out.println("Deleted");
                return;
            } else {
                if (presentNode.left != null) {
                    queue.add(presentNode.left);
                }
                if (presentNode.right != null) {
                    queue.add(presentNode.right);
                }
            }

            System.out.println("Does Not Exist Tree for this time please try again ");
        }
    }
    
    // Delete Entire Tree
    
     void deleteBT(){
         root = null;
         System.out.println("Deleted Successfully");
     }

    public static void main(String[] args) {

        DeleteNodeMethodUsingLinkedList binarytElement = new DeleteNodeMethodUsingLinkedList();

//    SearchMethod tt = new Searchethod();//it is saperate for only search method only 
        BinaryNode N1 = new BinaryNode();

        N1.value = "N1";

        BinaryNode N2 = new BinaryNode();

        N2.value = "N2";
        BinaryNode N3 = new BinaryNode();

        N3.value = "N3";
        BinaryNode N4 = new BinaryNode();

        N4.value = "N4";
        BinaryNode N5 = new BinaryNode();

        N5.value = "N5";
        BinaryNode N6 = new BinaryNode();

        N6.value = "N6";
        BinaryNode N7 = new BinaryNode();

        N7.value = "N7";

        BinaryNode N8 = new BinaryNode();

        N8.value = "N8";
        BinaryNode N9 = new BinaryNode();

        N9.value = "N9";

        N1.left = N2;
        N1.right = N3;
        N2.left = N4;
        N2.right = N5;
        N3.left = N6;
        N3.right = N7;
        N4.left = N8;
        N4.right = N9;
        binarytElement.root = N1;
        binarytElement.deleteNode("N2");
        binarytElement.deleteBT();
    }
}
