/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section6_predefined_functional_interfaces_predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

/**
 *
 * @author roshan_patidar
 */
public class PredicateCheckIsEmpty {
    public static void main(String[] args) {
        Predicate<Collection> p=s->s.isEmpty();
        ArrayList l1=new ArrayList();
        l1.add("A");
        System.out.println(p.test(l1)); // it is not empty
        ArrayList l2 = new ArrayList();
       
        System.out.println(p.test(l2)); //  it is empty so it will print true 
    }
    
}
