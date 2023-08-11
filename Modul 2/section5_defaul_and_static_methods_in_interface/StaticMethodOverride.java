/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section5_defaul_and_static_methods_in_interface;

/**
 *
 * @author roshan_patidar
 */



//it will executed because both methods are different 
interface Interf{
public static void m1(){
    System.out.println("Interface Method");
}

}
 class StaticMethodOverride implements Interf {

       
         
     
     //when we take main method so it will give compilation error 
         
     
    private static void m1(){
        System.out.println("Override");
    } 
            }



    

