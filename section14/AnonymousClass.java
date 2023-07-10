/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section14;

/**
 *
 * @author roshan_patidar
 */
abstract class My1{
    abstract void Display();
}
class Outer21{
    public void meth12(){
        My1 m = new My1(){
            public void Display(){
                System.out.println("Hello");
            }
        };
        m.Display();
    }
}
public class AnonymousClass {
    public static void main(String[] args) {
        Outer21 sc = new Outer21();
        sc.meth12();
    }
}
