/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25_collection.com;

import java.util.ArrayList;
import java.util.List;
import static section25_collection.com.ArrayListDemo.show; // import show method of democlass and override the show method 
                                                                

/**
 *
 * @author roshan_patidar
 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
         ArrayList<Integer> al1=new ArrayList<>(20);
        
        ArrayList<Integer> al2=new ArrayList<>(List.of(50,60,70,80,90));
        al1.addAll(al2);
            al1.forEach(n->System.out.println(n));// it is lambda expression related just print all the elements 
      


al1.forEach(System.out::println);// print all the elements 
               




        al1.forEach(n->show(n)); // its print the only above 60 elements because in before 
                                  // package we make method show and take if condition 
    }
}
