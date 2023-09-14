/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays_module_4;

/**
 *
 * @author roshan_patidar
 */
public class AccessingArrayElements {
    public static void main(String[] args) {
      Insertion_Of_Array sda= new Insertion_Of_Array(10);
      sda.insert(0,0);
      sda.insert(1,10);
      sda.insert(1,11);
      sda.insert(3,0);
      // just we create the variale and print the value of this indexing of array.
      var firstElement = sda.arr[0];//  Time Complexity is O(1)
        System.out.println(firstElement);// space complexity is also O(1) because it is not accessing any space for that.
        var fourthElement =sda.arr[4];//Time Complexity is O(1)
        System.out.println(fourthElement);// its facing exception "ArrayIndexOutOfBondsException" so we can not access the element of fourthElement.
// TODO code application logic here
    }
     
}
