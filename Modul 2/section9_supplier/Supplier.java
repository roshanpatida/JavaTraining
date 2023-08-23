/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section9_supplier;

/**
 *
 * @author roshan_patidar
 */

import java.util.function.Supplier;
 class Supplier
 {
 public static void main(String[] args)
 {
 Supplier<String> s =()->{
 String[] s1={"Sunny","Bunny","Chinny","Pinny"};
 int x =(int)(Math.random()*4);
 return s1[x];
 };
System.out.println(s.get());
 System.out.println(s.get());
 System.out.println(s.get());
}
 } 