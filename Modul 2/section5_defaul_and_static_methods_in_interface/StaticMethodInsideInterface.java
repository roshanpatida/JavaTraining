/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section5_defaul_and_static_methods_in_interface;

/**s
 *
 * @author roshan_patidar
 */
interface Interf{
    public static void m1(){
        System.out.println("interface static method ");
    }
}
public class StaticMethodInsideInterface implements Interf {
    public static void main(String[] args) {
        StaticMethodInsideInterface t=new StaticMethodInsideInterface();
//        t.m1(); its not execute beacause we can call through only inteface to static method 
//StaticMethodInsideInterface.m1();
Interf.m1();
    }
}

//untill version 1.7 we cannot call static method directly through command propt.
// but after that we can call through interface.
// for example  1) java Interf.java
              //2) javac Interf.java


// we can call from this  steps .

