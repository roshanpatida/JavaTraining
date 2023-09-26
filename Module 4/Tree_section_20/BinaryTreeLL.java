/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tree_section_20;


import java.util.Queue;
/**
 *
 * @author roshan_patidar
 */

 
public class BinaryTreeLL {
  BinaryNode root;

  public BinaryTreeLL() {
    this.root = null;
  }

  // PreOrder Traversal
  public void preOrder(BinaryNode node) {
    if (node == null) {
      return;
    }
    System.out.print(node.value + " ");
    preOrder(node.left);
    preOrder(node.right);
  }

  // Inprder traversal implementation.
  
  void inOrder(BinaryNode node){
      if(node == null){
          return;
      }
      inOrder(node.left);       
      System.out.println(node.value + " ");
      inOrder(node.right);
          }
  // PostOrder implementation
  void postOrder(BinaryNode node){
      if(node==null){
          return;
         
      }
      postOrder(node.left);
      postOrder(node.right);
        System.out.println(node.value+" ");
      
  }
  
  // Level Order  implementation 
  
  void levelOrder(){
      Queue<BinaryNode> queue= new Queue<BinaryNode>() ;
      queue.add(root);
      while(!queue.isEmpty()){
          BinaryNode presentNode = queue.remove();
          System.out.println(presentNode.value + " ");
          if(presentNode.left != null){
              queue.add(presentNode.left);
          }
          if(presentNode.right != null){
              queue.add(presentNode.right);
          }
          
      }
  }
  
  
  //Search method implementation
  
  void search(String value){
      Queue<BinaryNode> queue= new LinkedList<BinaryNode>();
      queue.add(root);
      while(!queue.isEmpty()){
          BinaryNode presentNode = queue.remove();
          if(presentNode.value==value){
              System.out.println("The value " + value + " is found in the tree");
              return;
          }
          else{
              if(presentNode.left != null){
                  queue.add(presentNode.left);
                  
              }
              if(presentNode.right!= null){
                  queue.add(presentNode.right);
              }
          }
      }
      System.out.println("The value "+ value+ " is not found in the tree");
  }
}   

