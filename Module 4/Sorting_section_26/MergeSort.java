/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting_section_26;

/**
 *
 * @author roshan_patidar
 */
public class MergeSort {

  public void merge(int[] A, int left, int middle, int right) {
    int[] leftTmpArray = new int[middle-left+2];
    int[] rightTmpArray = new int[right-middle+1];
    for (int i=0; i<=middle-left; i++) {
      leftTmpArray[i] = A[left+i];
    }
    for (int i=0; i<right-middle; i++) {
      rightTmpArray[i] = A[middle+1+i];
    }


    leftTmpArray[middle-left+1] = Integer.MAX_VALUE;
    rightTmpArray[right-middle] = Integer.MAX_VALUE;

    int i = 0, j = 0;
    for (int k = left; k<=right; k++) {
      if (leftTmpArray[i] < rightTmpArray[j]) {
        A[k] = leftTmpArray[i];
        i++;
      } else {
        A[k] = rightTmpArray[j];
        j++;
      }

    }

  }

  public void mergeSort(int[] Array, int left, int right) {
    if (right > left) {
      int m = (left+right)/2;
      mergeSort(Array, left, m);
      mergeSort(Array, m+1, right);
      merge(Array, left, m, right);
    }
  }



	public void printArray(int []array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"  ");
		}
	}
    public static void main(String[] args) {
          MergeSort ss = new MergeSort();
          int array[] = {1,4,2,5,2,6,3};
          ss.printArray(array);
           System.out.println();
          ss.mergeSort(array, 0, array.length-1);
          ss.printArray(array);
    }
   
}