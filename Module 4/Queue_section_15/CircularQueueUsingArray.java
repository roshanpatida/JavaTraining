/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue_section_15;

/**
 *
 * @author roshan_patidar
 */
public class CircularQueueUsingArray {
   int arr[];
   int rear;
   int front;
   int size;
    CircularQueueUsingArray(int size){
        this.arr=new int[size];
        this.size = size;
        this.front=-1;
        this.rear=-1; 
        System.out.println("Queue is created siuccessfully " + size);
    }
    
    // isEmpty method implementation 
    public boolean isEmpty(){
        return rear==-1 && front ==-1;
           
    }
    
    // isFull method implementation
    public boolean isFull(){
        return (rear +1 )% size ==  front;
    }
    
    //enQueue method implementation 
    
   public void add(int value ){
       if(isFull()){
             System.out.println("Queue is already full");
             
       }
       if(front == -1){
           front =0;
           rear = (rear +1)% size;
           arr[rear] = value;
           System.out.println("Value inserted ");
       }
        System.out.println("Inserted");
   }
   // deQueue method implementation 
   
   public int remove(){
       if(isEmpty()){
           System.out.println("Queue is already empty");
           return -1;
       }
       int result  = arr[front];
       
       
       if(rear == front){
           rear = front = -1;
       }else{
           front = (front + 1) % size;
       }
       return result;
   }
  public int peek(){
      if(isEmpty()){
           System.out.println(" Queue is already empty ");
           return -1;
      }
      
      return arr[front];
      
   
  }
   
}
