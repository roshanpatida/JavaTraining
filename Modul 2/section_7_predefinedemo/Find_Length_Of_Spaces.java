/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section_7_predefinedemo;

import java.util.function.Function;

/**
 *
 * @author roshan_patidar
 */
public class Find_Length_Of_Spaces {
    public static void main(String[] args) {
        
    
 
    String s= " We are from Brainvire";
        Function<String,Integer> f= s1->s1.length() - s1.replaceAll(" ","").length();
        System.out.println(f.apply(s));
    }   
}
