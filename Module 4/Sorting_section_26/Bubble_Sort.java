/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting_section_26;

/**
 *
 * @author roshan_patidar
 */
public class Bubble_Sort {
   

  void bubbleSort(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n-1; i++) {
      for (int j =0; j < n-i-1; j++) {
        if (arr[j] > arr[j+1]) {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }

  void printArray(int arr[]) {
    int n = arr.length;
    for (int i = 0; i<n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
    public static void main(String[] args) {
        Bubble_Sort ss = new Bubble_Sort();
     
        int arr[] = {1,6,2,8,3,6,2};
           ss.printArray(arr);
        ss.bubbleSort(arr);
        ss.printArray(arr);
    }
} 


