/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section9_supplier;

/**
 *
 * @author roshan_patidar
 */
import java.util.function.*;
import java.util.*;
 class SystemDate
 {
 public static void main(String[] args)
 {
 Supplier<> s=()->new Date(); // its return value only it does't take any value
 System.out.println(s.get());
 System.out.println(s.get());
 System.out.println(s.get());
 }
} 