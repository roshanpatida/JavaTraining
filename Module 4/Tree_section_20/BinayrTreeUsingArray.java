/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tree_section_20;

/**
 *
 * @author roshan_patidar
 */
public class BinayrTreeUsingArray {
    String[] arr;
    int lastUsedIdex;
    public BinayrTreeUsingArray(int size){
        arr = new String[size+1];
        this.lastUsedIdex=0;// just create blank tree
        System.out.println("Blank Tree of size " +  size + " is created successfully");
    }
    // isFull Method 
    public boolean isFull(){
        if(arr.length-1 == lastUsedIdex){
            return true;
            
        }
        else {return false;}
    }
    
   // Inserted Method 
    
    void insert(String value){
        if(!isFull()){
            arr[lastUsedIdex +1] = value;
            lastUsedIdex++;
            System.out.println("Inserted");
        }
        else{
            System.out.println(" Tree is already full");
        }
    }
    
    // preOrder Using Array
     public void preOrder(int index){
         if(index > lastUsedIdex){
             return;
         }
          System.out.println(arr[index] + " ");
          preOrder( index * 2);
          preOrder(index * 2 + 1);
     }    
    // inOrder travesal using array
     public void inOrder(int index){
         if(index> lastUsedIdex){
             return;}
             inOrder(index * 2);
              System.out.println(arr[index]+ " ");
              inOrder(index * 2 +1);
         
     }
     
     // postOrder travesal Using Array
public void postOrder(int index){
    if(index > lastUsedIdex){
        return;
    }
    postOrder(index *2);
    postOrder(index * 2 +1);
    System.out.println(arr[index] + " ");
}    
     public static void main(String[] args) {
       BinayrTreeUsingArray binary = new BinayrTreeUsingArray(5);
     binary.insert("A");
     binary.insert("B");
          binary.insert("A");
     binary.insert("B");
          binary.insert("A");
     binary.insert("B");
     binary.preOrder(3);
     binary.postOrder(3);
     binary.inOrder(3);
    }
}
