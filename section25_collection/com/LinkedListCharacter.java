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
public class LinkedListCharacter {
    public static void main(String[] args) {
          LinkedList<Character>  al1= new LinkedList<>();
 LinkedList<Character> al2= new LinkedList<>(List.of('d','a','r','f')); 
 al1.addAll(al2);
        System.out.println(al1);
        al1.toArray();
        System.out.println("toarray"+ al1);
           
    }
}
