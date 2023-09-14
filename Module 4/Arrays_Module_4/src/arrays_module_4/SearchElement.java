/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays_module_4;

/**
 *
 * @author roshan_patidar
 */
public class SearchElement {
    int arr[] = null;
    
    public SearchElement(int sizeOfArray){
        arr = new int[sizeOfArray];
        for(int i =0;i<arr.length;i++){
        arr[i]=Integer.MIN_VALUE;
    }
    }
    public void insert(int location, int valueToBeInserted){
        try{
            if(arr[location] == Integer.MIN_VALUE){
                arr[location] = valueToBeInserted;
                System.out.println("Successfully inserted");
            }
            else{
                System.out.println("This cell is alreadh occupied");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array! ");            
        }
    }
   
    
    
    // for searching the element in the inserting element of array
    
    public void searchElement(int value){ // Time coplexity is O(N)
        for(int i=0;i<arr.length;i++){ // O(1)
            if(arr[i]==value){//O(1)
                 System.out.println("Value is found at the index of "+ i);
              return; 
            }}
        
        System.out.println(value+" is not found in the array");
    }
        }
    
   

