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
public class PredicateStringcheck {
    public static void main(String[] args) {
        Predicate<String> p=s->s.length()>5;
        System.out.println(p.test("Helloooo"));
        System.out.println(p.test("j"));
    }
}
