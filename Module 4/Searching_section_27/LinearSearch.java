/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Searching_section_27;

/**
 *
 * @author roshan_patidar
 */
public class LinearSearch {


  public static int linearSearch(int arr[], int value) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == value) {
        System.out.println("The element is found at the index: " + i);
        return i;
      }
    }
    System.out.println("The element " + value+ " not found.");
    return -1;
  }
    public static void main(String[] args) {
        int arr[] =  {8, 9, 12, 15, 17, 19, 20, 21, 28};

        LinearSearch.linearSearch(arr, 17);
    }


// [8, 9, 12, 15, 17, 19, 20, 21, 28]
//  S              M               E
//  S  M      E
//         SM E
//            SME  
}
