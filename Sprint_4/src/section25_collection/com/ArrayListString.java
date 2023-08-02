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
public class ArrayListString {
    public static void main(String[] args) {
        ArrayList<String> sc = new ArrayList<>();
 ArrayList<String> sc1= new ArrayList<>(List.of("hello","nice"));
 sc.addAll(sc1);
        System.out.println(sc);
   System.out.println(sc.toArray(args));
     
        System.out.println(sc.toString());
    }
}
