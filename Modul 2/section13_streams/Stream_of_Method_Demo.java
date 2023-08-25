/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section13_streams;

import static java.util.Arrays.stream;
import java.util.stream.Stream;
import static java.util.stream.StreamSupport.stream;

/**
 *
 * @author roshan_patidar
 */
public class Stream_of_Method_Demo {
    public static void main(String[] args) {
       
    // Stream.of() is used to apply on gruop of values 
   Stream<Integer> s = Stream.of(9,99,999,9999,99999); 
   s.forEach(System.out::println);
   
        System.out.println("-------------------------");
        
        
        // its apply on array which is print all the array elements 
         Double[] d={1.0,10.0,100.0};
         Stream<Double> s1=Stream.of(d);
         s1.forEach(System.out::println);
}
}