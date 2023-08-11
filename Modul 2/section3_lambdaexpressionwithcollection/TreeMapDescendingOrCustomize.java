/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section3_lambdaexpressionwithcollection;

/**
 *
 * @author roshan_patidar
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.TreeMap;

/**
 *
 * @author roshan_patidar
 */
public class TreeMapDescendingOrCustomize {
    public static void main(String[] args) {
        
    
    TreeMap<Integer,String> s=new TreeMap<Integer,String>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
  s.put(1,"hello");  
  s.put(3, "Roshan");
  s.put(2,"would");  //Customize sorting Order ( Descending )
  s.put(8, "harshit");
        System.out.println(s);
         
}}
