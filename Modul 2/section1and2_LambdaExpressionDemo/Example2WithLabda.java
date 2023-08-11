/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section1and2_LambdaExpressionDemo;

/**
 *
 * @author roshan_patidar
 */
interface Interf{
public void m1(int par, int par1);
}

public class Example2WithLabda {
    public static void main(String[] args) {
        Interf i = (par1,par2)->System.out.println(par1+par2);
        i.m1(10, 20);
    }
}


    

