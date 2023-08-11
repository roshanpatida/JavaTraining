/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section3_lambdaexpressionwithcollection;

import java.util.TreeMap;

/**
 *
 * @author roshan_patidar
 */
public class TreeMapAscendingOrderOrDefaltOrder {
    public static void main(String[] args) {
        
    
    TreeMap<Integer,String> s=new TreeMap<Integer,String>();
  s.put(1,"hello");  
  s.put(3, "Roshan");
  s.put(2,"would");  //Default natural Order
  s.put(8, "harshit");
        System.out.println(s);
         
}}
