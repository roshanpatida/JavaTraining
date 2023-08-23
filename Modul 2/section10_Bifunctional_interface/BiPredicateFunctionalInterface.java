/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section10_Bifunctional_interface;

import java.util.function.BiPredicate;

/**
 *
 * @author roshan_patidar
 */
public class BiPredicateFunctionalInterface {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> p =(a,b)->(a+b)%2==0;
          System.out.println(p.test(10,20));
          System.out.println(p.test(105,200));
    }
}
