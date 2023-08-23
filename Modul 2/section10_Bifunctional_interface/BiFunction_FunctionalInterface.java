/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section10_Bifunctional_interface;

import java.util.function.BiFunction;

/**
 *
 * @author roshan_patidar
 */

// BiFunction is take two input parameter and return value in any type
// normal function is havingt two input which related to one is take input and second is for return 
public class BiFunction_FunctionalInterface {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> f =(a,b)->(a+b);
        System.out.println(f.apply(10, 20));
    }
}
