/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section10;

/**
 *
 * @author roshan_patidar
 */
public class Fabbonacci {
    static void abbonacci(int x,int a, int b){
        System.out.print(a + " " + b);
        while(x>0){
           int  c=a+b;
            System.out.print(" "+ c);
            a=b;
            b=c;
            x--;        }
    }
    public static void main(String[] args) {
     
        abbonacci(5,0,1);
        
    }
}
