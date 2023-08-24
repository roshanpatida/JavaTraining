/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section13_streams;

import java.util.ArrayList;

/**
 *
 * @author roshan_patidar
 */
public class Max_Method_Demo {
    public static void main(String[] args) {
        
    
     ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(0);
        l.add(90);
        l.add(15);
        l.add(2);
        l.add(7);
        System.out.println(l);
        
        Integer min=l.stream().max((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(min);
}}
