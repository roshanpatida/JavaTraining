/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue_section_15;

/**
 *
 * @author roshan_patidar
 */
public class QueueNormalProgram {
    int arr[];
    int top;
    int biginingOfQueue;
    QueueNormalProgram(int size){
        this.arr=new int[size];
        this.top=-1;
        this.biginingOfQueue=-1;
        
              System.out.print("Queue is created successfully , size is : "+ size);
               System.out.println();
            }
// isFull  method implementation 
    public boolean isFull(){
        if(top == arr.length-1){
           return true;
           
        }
        else {
            return false;
        }
    }
    
    // isEmpty Method implementation 
    public boolean isEmpty(){
        if(biginingOfQueue == -1 || biginingOfQueue == arr.length){
            return true;
            
        }
        else{
            return false;
        }
    }
    
    // enQueue method implementation 
    // it is inserted element from the rear
    public void enQueue(int value){
        if(isFull()){
            System.out.println("Queue is Full , you are not inserted the value in the queue");
        }
        else if(isEmpty()){
            biginingOfQueue = 0;
            top++;
            arr[top] = value;
            System.out.println("Successful inserted " + value + " in the queue");
        }
        else{
            top++;
            arr[top] = value;
            System.out.println("The value is Inserted");
        }
    }
    // deQueue method implementation 
    // dequeue method is fatch elements from the queue
    
    public int deQueue(){ // in the deQueue operation - Time complexity is always O(1)
        if(isEmpty()){
             System.out.println("The Queue is Empty");
             return -1;
        }
        else {
            int result = arr[biginingOfQueue];
            biginingOfQueue++;
         if(biginingOfQueue>top){
             biginingOfQueue = top = -1;
             
         }   
         return result;
        }
        
    }
    
    // Peek method implemetation 
   
    public int peek(){
        if(!isEmpty()){
             int result = arr[biginingOfQueue];
            return result;
            
        }
        else {
             System.out.println("The Queue is Empty");
             return -1;
        }
    }
    
    // delete method implementation 
    public void deDelete(){
        arr =null;
        System.out.println("Queue is Seccessfully Deleted");
    }
    
        }
        
    

