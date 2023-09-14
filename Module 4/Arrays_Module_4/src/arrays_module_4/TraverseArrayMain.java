
package arrays_module_4;

/**
 *
 * @author roshan_patidar
 */

    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import arrays_module_4.TraverseArray;

/**
 *
 * @author roshan_patidar
 */
public class TraverseArrayMain {
    public static void main(String[] args) {
      TraverseArray sda= new TraverseArray(4);
      sda.insert(0,0);
      sda.insert(1,10);
      sda.insert(2,11);
      sda.insert(3,0);
      
        System.out.println("Array Traversal");
        
        sda.treaverse();
    }
     
}


