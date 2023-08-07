/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section1_LabdaExpressionDemo;

/**
 *
 * @author roshan_patidar
 */

 
interface Interf1{
public int m1(String s);
}
class Demo4 implements Interf1{
    public int m1(String s){
        return s.length();}
}
public class Examople3Without {
    public static void main(String[] args) {
        Interf1 i = new Demo4();
        System.out.println(i.m1("hello"));
    }
}


    

