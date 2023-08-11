/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section6_predefined_functional_interfaces_predicate;

import java.util.function.Predicate;

/**
 *
 * @author roshan_patidar
 */
public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> p = I->I>10;
        System.out.println(p.test(100));
        System.out.println(p.test(5));
    }
 
}
