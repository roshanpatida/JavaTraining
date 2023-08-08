/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section1_LabdaExpressionDemo;

/**
 *
 * @author roshan_patidar
 */
@FunctionalInterface
interface Functional{
public void m1();
}
interface  p extends Functional {
public void m2();
}
public class FunctionalInheritClass {
    
}
// its work properly because we use i used only single @functional interface annotation
// and  both interface are different and it will excute perfectly and when we use functional interface 
// in every interface so all the present in a single annotation so we can take only one abstract method in all the over the interfaces.