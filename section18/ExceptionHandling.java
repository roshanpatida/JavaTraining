/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section18;

/**
 *
 * @author roshan_patidar
 */
public class ExceptionHandling {
    public static void main(String[] args) {
        int a,b,c;
        try{
            a=10;
            b=0;
            c=a/b;
            System.out.println("result is" +c );
        }
        catch(ArithmeticException e){
            System.out.println("Divide by zero");            
        }
            
    }
}
