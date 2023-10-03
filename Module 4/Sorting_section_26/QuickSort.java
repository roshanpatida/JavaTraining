//*
//* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
//* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
//*/
//package Sorting_section_26;
//
///**
//*
//* @author roshan_patidar
//*/
//public class QuickSort {
//
//public int partition( int l , int h){
//int a[]={7,7,9,9,};
//        int pivot = a[l];
//        int i = l;
//        int j = h;
//        while(i<j){
//            while(a[i]<=pivot){
//                i++;
//                
//            }
//            while(a[j]>=pivot){
//                j--;
//            }
//            if(i<j){
//                int t = a[i];
//                a[i] = a[j];
//                a[j] = t;
//                return i;
//            }
//          }
//        int t = a[i];
//        a[i] = a[j];
//        a[j] = t;
//       
//            return j;
//      
//        }
//    public void quickSort(int l,int h){
//        if(l<h){
//            int pivot  = partition(l,h);
//            quickSort(l,pivot-1);
//            quickSort(pivot+1,h);
//        }
//    
//   
//    }
// 
//
//	public void printArray(int []a) {
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i]+"  ");
//                }}
//    public static void main(String[] args) {
//        QuickSort ss = new QuickSort();
//          int a[]={2,6,3,7,0,3};
//        ss.quickSort(0,5);
//        ss.printArray(a);
//    }
//}
//
public class QuickSort 
{  
    /* function that consider last element as pivot,  
place the pivot at its exact position, and place  
smaller elements to left of pivot and greater  
elements to right of pivot.  */  
int partition (int a[], int start, int end)  
{  
    int pivot = a[end]; // pivot element  
    int i = (start - 1);  
  
    for (int j = start; j <= end - 1; j++)  
    {  
        // If current element is smaller than the pivot  
        if (a[j] < pivot)  
        {  
            i++; // increment index of smaller element  
            int t = a[i];  
            a[i] = a[j];  
            a[j] = t;  
        }  
    }  
    int t = a[i+1];  
    a[i+1] = a[end];  
    a[end] = t;  
    return (i + 1);  
}  
  
/* function to implement quick sort */  
void quick(int a[], int start, int end) /* a[] = array to be sorted, start = Starting index, end = Ending index */  
{  
    if (start < end)  
    {  
        int p = partition(a, start, end);  //p is partitioning index  
        quick(a, start, p - 1);  
        quick(a, p + 1, end);  
    }  
}  
  
/* function to print an array */  
void printArr(int a[], int n)  
{  
    int i;  
    for (i = 0; i < n; i++)  
        System.out.print(a[i] + " ");  
}  
    public static void main(String[] args) {  
    int a[] = { 13, 18, 27, 2, 19, 25 };  
    int n = a.length;  
    System.out.println("\nBefore sorting array elements are - ");  
    QuickSort q1 = new QuickSort();  
    q1.printArr(a, n);  
    q1.quick(a, 0, n - 1);  
    System.out.println("\nAfter sorting array elements are - ");  
    q1.printArr(a, n);  
    System.out.println();  
    }  
}  