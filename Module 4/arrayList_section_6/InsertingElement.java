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
public class InsertingElement {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(22);
        numbers.add(14);
        System.out.println(numbers);
        
        ArrayList<String> letter = new ArrayList<String>();
        letter.add("A");
        letter.add("B");
        letter.add("C");
        System.out.println(letter );
        
        //inserting element in the existing array list.
        
          ArrayList<String> letters = new ArrayList<String>();
        letters.add("A");
        letters.add(1,"D");
        letters.add("C");
        System.out.println(letters );
        
    }
}
