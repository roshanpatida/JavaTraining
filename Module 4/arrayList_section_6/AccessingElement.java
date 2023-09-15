/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayList_section_6;

import java.util.ArrayList;

/**
 *
 * @author roshan_patidar
 */
public class AccessingElement {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(22);
        numbers.add(14);
        System.out.println(numbers);
        
        // access the element of indexing number 1 through the help of "get()" method
         System.out.println(numbers.get(1));
        
}
    }