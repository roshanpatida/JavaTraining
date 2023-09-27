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
public  class Element {

  static  BinaryNode root;

    public Element() {
        this.root = null;
    }

// Create binaryTree using arraylist.
    static class BinaryNode {

        public String value;
        public BinaryNode left;
        public BinaryNode right;
        public int height;

    }

   
    

    // Level Order  implementation 
    void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.println(presentNode.value + " ");
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }

        }
    }

    public static void main(String[] args) {

        Element binarytElement = new Element();
      
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
  binarytElement.root=N1;
  binarytElement.levelOrder();
    }
}
