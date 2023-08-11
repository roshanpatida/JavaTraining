/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section5_defaul_and_static_methods_in_interface;

/**
 *
 * @author roshan_patidar
 */
interface Left{
    default void m1(){
        System.out.println("Left Interface");}
            
}
interface Right{
    default void m1(){
        System.out.println("Right Interface");
            
}
      
public class DefaultMethodsWRTMultipleInheritance implements Left,Right{
    public void m1(){
        System.out.println("My own implementation");
        Left.super.m1(); // i call the method of left side interface
    }
    public static void main(String[] args) {
        DefaultMethodsWRTMultipleInheritance t=new DefaultMethodsWRTMultipleInheritance();
        t.m1();
    }
}
    
}
