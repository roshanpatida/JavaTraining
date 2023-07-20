/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section24_generics.com;

/**
 *
 * @author roshan_patidar
 */
public class NormalMethod {

    public NormalMethod() {
    }
    <T> void show(T v){
        System.out.println(v);
    }
    public static void main(String[] args){
        NormalMethod s= new NormalMethod();
//        s.<Integer>show=(10);
        s.<String>show("Roshan");//it is type casting string 
    }
}
