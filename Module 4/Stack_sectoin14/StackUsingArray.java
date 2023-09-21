package Stack_sectoin14;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roshan_patidar
 */
public class StackUsingArray {
   int[] arr;
   int top;
   public StackUsingArray(int size){
       this.arr=new int[size];
       this.top=-1;
       System.out.println("The stack is created with size of "+ size);
       
   }
     //isempty check
        
        public boolean isEmpty(){
            if(top==-1)
            {
                return true;
                
            }
            else {
                return false;
            }}
        // isFull check
      
      public boolean isFull(){
          if(top==arr.length-1){
              System.out.println("The stack is full");
              return true;
          }
          else{return false;
              
          }
      }
      
    public static void main(String[] args) {
        StackUsingArray n = new StackUsingArray(4);
        boolean result =  n.isFull();
         System.out.println(result);
         boolean empty = n.isEmpty();
         System.out.println(empty);
      
        }  
    }

