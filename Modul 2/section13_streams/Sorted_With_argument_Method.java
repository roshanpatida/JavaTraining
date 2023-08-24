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
public class Sorted_With_argument_Method {
    public static void main(String[] args) {
          ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(0);
        l.add(14);
        l.add(15);
        l.add(90);
        l.add(7);
        System.out.println(l);
        List<Integer> l1= l.stream().sorted().collect(Collectors.toList());
         System.out.println("Default natural order : "+l1);
    }
   
}
