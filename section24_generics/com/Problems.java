/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section24_generics.com;

/**
 *
 * @author roshan_patidar
 */
public class Problems {
    
    public static void main(String[] args) {
       Object obj[]=new Object[3];
       obj[0]="hi";
       obj[1]="bye";
       obj[2]=10; // it is not work because type casting problem is faced here
       // and we assign the dataype is string only so it will throw error of integer type
       
       String str;
       for(int i =0;i<3;i++){
           str=(String)obj[i];
           System.out.println(str);
       }
               
    }
}
