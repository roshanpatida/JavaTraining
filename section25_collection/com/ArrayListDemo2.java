/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25_collection.com;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author roshan_patidar
 */
public class ArrayListDemo2 {
    public static void main(String[] args) {
        
      ArrayList<Integer> al1=new ArrayList<>(20);
        
        ArrayList<Integer> al2=new ArrayList<>(List.of(50,60,70,80,90));
        al1.addAll(al2);
       System.out.println(al1.contains(25));
        System.out.println(al1.get(5));
        System.out.println(al1.indexOf(70));
        System.out.println(al1.lastIndexOf(70));
}
}
