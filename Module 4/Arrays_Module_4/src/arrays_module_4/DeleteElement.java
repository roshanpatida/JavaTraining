/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays_module_4;

/**
 *
 * @author roshan_patidar
 */
public class DeleteElement {
    int arr[] = null;
    
    public DeleteElement(int sizeOfArray){
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
   
    public void deleteValue(int value){
        try{
            arr[value] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted succssfully");
            
        }
        catch(ArrayIndexOutOfBoundsException e){
             System.out.println("THe value that is provided is not in the range of array");
        }
    }
    
    // for searching the element in the inserting element of array
    
   // Time coplexity is O(1) for all steps 
    // space is also O(1)
    
    }
        
    
   

