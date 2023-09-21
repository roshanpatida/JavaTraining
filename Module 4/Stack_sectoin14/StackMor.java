/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack_sectoin14;

/**
 *
 * @author roshan_patidar
 */
public class StackMor {
    int arr[];
    int top;
   StackMor(int size){
       this.arr= new int[size];
       this.top=-1;
       
   }
     public boolean isFull(){
          if(top==arr.length-1){
              System.out.println("The stack is full");
              return true;
          }
          else{
              return false;
              
       
          }
      }
     public void print(){
         for(int i=0;i<top;i++){
             System.out.print( arr[i]);
                 
                    
         }
     }
     // push method implementation 
    public void push(int value)
    {
        if(isFull()){
            System.out.println("stack is already full");
        }
        else{
            arr[top+1]=value;
            top++;
            System.out.println("Value is inserted ");
        }
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
   // pop method implementation
    
    public int pop(){
        if(isEmpty()){
             System.out.println("Stack is empty, you can't do anything");
          return 0;
            
        }
             else{
                    int  Pp=arr[top];
                      top--;
                     return Pp; 
                }
       
    }
      
    public static void main(String[] args){
        StackMor s = new StackMor(4);
        s.push(4);
        s.push(3);
        s.push(4);
        s.push(4);
        System.out.println("Original stack is : ");
       s.print();
        System.out.println();
       
        System.out.println("After the perform pop operation in the exisiting stack ");
        int result = s.pop();
         System.out.println(result);
  
          
         int result1 = s.pop();
         System.out.println(result1);
         int result3 = s.pop();
         System.out.println(result3);
         int result4 = s.pop();
         System.out.println(result4);
         int result5 = s.pop();
         System.out.println(result5);
         
    }
}
