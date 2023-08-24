/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section13_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author roshan_patidar
 */
public class Sorted_Customize_Method {
    public static void main(String[] args) {
          ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(0);
        l.add(90);
        l.add(15);
        l.add(2);
        l.add(7);
        System.out.println(l);
        // this sorted method sort the elements by comparator object we can sort the element based on our customize order
        List<Integer> l1= l.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
         System.out.println("Customize Order ,descending order : "+l1);
    }
   
}
