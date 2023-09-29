/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting_section_26;

/**
 *
 * @author roshan_patidar
 */

    public class InsertionSort {

	// InsertionSort
 public  void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int temp = arr[i], j = i;
      while ( j> 0 && arr[j-1]>temp) {
        arr[j] = arr[j-1];
        j--;
      }
      arr[j] = temp;
    }
  }


	public void printArray(int []array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"  ");
		}
	}
        public static void main(String[] args) {
          InsertionSort  ss = new InsertionSort();  
        
int arr[] = {1,5,3,7,8,3,9};
   ss.printArray(arr);
   ss.insertionSort(arr);
            System.out.println();
   ss.printArray(arr);
         
}
    }
