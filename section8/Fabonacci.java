/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section8;

/**
 *
 * @author roshan_patidar
 */
public class Fabonacci {
    public static void main(String[] args) {
 int n1=0,n2=1,n3=0;
        System.out.print(n1+ " "+ n2);
 for(int i = 0;i<7;i++){
     n3=n1+n2;   
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }
    }
}
