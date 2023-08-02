/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25_collection.com;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author roshan_patidar
 */
public class Check {
    public static void main(String[] args) {
             LinkedList<Integer>  al1= new LinkedList<>();
 LinkedList<Integer> al2= new LinkedList<>(List.of(10,20,30,40)); 
 al1.addAll(al2);
        System.out.println(al1);
    }
   
}
