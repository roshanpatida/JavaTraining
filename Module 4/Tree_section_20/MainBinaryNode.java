/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tree_section_20;

/**
 *
 * @author roshan_patidar
 */
public class MainBinaryNode {
    BinaryTreeLL binarytree=new BinaryTreeLL();
    SearchMethod tt = new SearchMethod();//it is saperate for only search method only 
BinaryNode N1 = new BinaryNode();
BinaryNode N2 = new BinaryNode();
BinaryNode N3 = new BinaryNode();
BinaryNode N4 = new BinaryNode();
BinaryNode N5 = new BinaryNode();
BinaryNode N6 = new BinaryNode();
BinaryNode N7 = new BinaryNode();
BinaryNode N8 = new BinaryNode();
BinaryNode N9 = new BinaryNode();

N1.value="N1";
N2.value="N2";

N3.value="N3";
N4.value="N4";

N5.value="N5";
N6.value="N6";

N7.value="N7";
N8.value="N8";
    N1.left=N2;
    N1.right=N3;
    N2.left=N4;
    N2.right=N5;
    N3.left=N6;
    N3.right=N7;
    N4.left=N8;
    N4.right=N9;
    binarytree.root=N1;
 binarytree.preOrder(binarytree.root);// for preOrder Traversal 
 binarytree.inOrder(binarytree.root);// it is for InOrder traversal implementation 
 binarytree.postOrder(binary.root); // it is for postOrder travesal implementation 
 
 tt.search("N2");// search method implementation calling , the class 'SearchMethod' is calles by this line
 
}
