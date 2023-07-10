/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section18;
import java.util.Scanner;
/**
 *
 * @author roshan_patidar
 */
public class DemoException {
    




    public static void main(String[] args) 
    {
        int a,b,c;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Eneter 2 numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        
        
        try
        {
            c=a/b;
            System.out.println("Division is" +c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("it is Exception");
        }
        System.out.println("Bye");
        
        
    } 
}

