/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting_section_26;

/**
 *
 * @author roshan_patidar
 */

 public class SelectionSort {

public  void selectionSort(int[] a) {
    for (int j = 0; j < a.length; j++) {
      int minimumIndex = j;
      for (int i = j+1; i<a.length; i++) {
        if (a[i] < a[minimumIndex]) {
          minimumIndex = i;
        }
      }
      if (minimumIndex != j) {
        int temp = a[j];
        a[j] = a[minimumIndex];
        a[minimumIndex] = temp;
      }
    }
  }


	public void printArray(int []array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"  ");
		}
	}

        public static void main(String[] args) {
         SelectionSort ss = new SelectionSort();
         int arr[] = {1,5,3,7,8,3,9};
         ss.printArray(arr);
       ss.selectionSort(arr);
       ss.printArray(arr);
       
     }
}   

