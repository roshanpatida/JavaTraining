/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25_collection.com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author roshan_patidar
 */
public class ArrayListCheck {
    public static void main(String[] args) {
        
    
 ArrayList<Integer> sc = new ArrayList<>();
 LinkedList<Integer> sc1= new LinkedList<>(List.of(10,20,230,30,30));
 sc.add(20);
 sc.addAll(sc1);
 System.out.println(sc);
 
         }

}