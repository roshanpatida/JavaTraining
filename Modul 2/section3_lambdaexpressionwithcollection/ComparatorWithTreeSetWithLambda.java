/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section3_lambdaexpressionwithcollection;

/**
 *
 * @author roshan_patidar
 */

import java.util.Comparator;
import java.util.TreeSet;
 
 class ComparatorWithTreeSetWithLambda
 {
 public static void main(String[] args)
 {
 TreeSet<Integer> l = new TreeSet<Integer>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
 l.add(10);
 l.add(0);
 l.add(15);
 l.add(5);
 l.add(20);
 System.out.println(l);
 }
 } 