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

  
public class SearchMethod {
  BinaryNode root;

  public SearchMethod() {
    this.root = null;
  }
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
    }}

