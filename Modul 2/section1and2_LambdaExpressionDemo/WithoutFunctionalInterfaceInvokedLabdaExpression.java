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
class Demo implements Interf{
    public void m1(int par, int par1){
        System.out.println("m1() implementatio");}
}
public class WithoutFunctionalInterfaceInvokedLabdaExpression {
    public static void main(String[] args) {
        Interf i = new Demo();
        i.m1(10, 20);
    }
}


    

