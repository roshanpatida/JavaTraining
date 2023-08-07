/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section1_LabdaExpressionDemo;

/**
 *
 * @author roshan_patidar
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author roshan_patidar
 */
interface Interf{
public void m1(int par, int par1);
}
 
public class WithFunctionalInterfaceInvokedLabda {
    public static void main(String[] args) {
        Interf i = (int par, int par1)->System.out.println("m1 implement");
        i.m1(10, 20);
    }
}


    



