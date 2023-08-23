/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section12_method_and_constructor_reference;

/**
 *
 * @author roshan_patidar
 */
interface InterF{
    public void m1();

}
// m1 method refer to m2  and we call m1 method so m2 method automaically called.
public class NonStaticMethodUsingDoubleColonOperator {
    public static void m2(){
        System.out.println("Internal Method");
        ;;;;;;
    }
    public static void main(String[] args) {
        InterF i=NonStaticMethodUsingDoubleColonOperator::m2;
        i.m1();
    }
    
}
