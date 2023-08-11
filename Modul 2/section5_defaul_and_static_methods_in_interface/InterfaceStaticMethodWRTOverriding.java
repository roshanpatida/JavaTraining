/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section5_defaul_and_static_methods_in_interface;

/**
 *
 * @author roshan_patidar
 */
//interface Interf{
//public static void m1(){
//    System.out.println("Interface Method");
//}
//
//}
//public class InterfaceStaticMethodWRTOverriding implements Interf {
//    public static void main(String[] args) {
//        
//    
//    public static void m1(){
//        System.out.println("Override");
//    } 
//            }
//}
// we can not override static method


//-----------------------------------------------------------------------------------------------------

// it will execute perfeclty because both method are different
interface Interf{
public static void m1(){
    System.out.println("Interface Method");
}

}
public class InterfaceStaticMethodWRTOverriding implements Interf {
//    public static void main(String[] args) {
        
    
    public void m1(){
        System.out.println("Override");
    } 
            }
