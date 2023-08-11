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
public class DisplayNamesStartFromK {
    public static void main(String[] args) {
        String[] names={"Sunny","Kunal","Roshan","Keshu"};
            Predicate<String> startwithk=s->s.charAt(0)=='K';
            System.out.println("The names start from K ");
            for(String s: names){
                if(startwithk.test(s)){
                    System.out.println(s);
                }
//                else { 
//                      System.out.println();
//                    System.out.println("Without K");
//                    System.out.println();
//                    System.out.println(s);
//                }
            }
    }
}
