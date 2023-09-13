/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays_module_4;

/**
 *
 * @author roshan_patidar
 */
public class Insertion_Of_Array {
    int arr[] = null;
    
    public Insertion_Of_Arrayay(int sizeOfArray){
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
    public static void main(String[] args) {
        
    }
   
}
