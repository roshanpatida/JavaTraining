/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section1_LabdaExpressionDemo;

/**
 *
 * @author roshan_patidar
 */@FunctionalInterface
interface Functional{
public void m1();
}
//@FunctionalInterface
interface  p extends Functional {
public void m2();// we will get error unexpected beacuse we use more then one abstract method
}

public class FunctionalInherit2 {
    public static void main(String[] args) {
      
    }
}

