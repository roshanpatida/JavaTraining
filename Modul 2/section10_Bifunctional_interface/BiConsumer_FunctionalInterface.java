/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section10_Bifunctional_interface;

import java.util.function.BiConsumer;

/**
 *
 * @author roshan_patidar
 */


// this Consumer is take two input and it won't return anything and its means is return type is "void"

//Normal consumer is  having ine parameter only which is take input and return void always

public class BiConsumer_FunctionalInterface {
    public static void main(String[] args) {
        BiConsumer<String,String> c=(s1,s2)->System.out.println(s1+s2);
        c.accept("Durga","Soft");
    }
}
