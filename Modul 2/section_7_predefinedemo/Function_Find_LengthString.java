/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package section_7_predefinedemo;


 import java.util.function.*;
import java.util.function.Function;
 class Functiona_Find_LengthString {
 public static void main(String[] args) {
 Function<String, Integer> f = s ->s.length();
 System.out.println(f.apply("Durga"));
 System.out.println(f.apply("Soft")); }}