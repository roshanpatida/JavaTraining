/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section9;

/**
 *
 * @author roshan_patidar
 */
public class ArrayPractice {
  public static void main(String[] args) {
        int A[]=new int[10];
        int B[]={1,2,3,4,5};
        
        int C[];
        
        B[2]=15;
        
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]);
        }
        
        
        for(int i=0;i<B.length;i++)
        {
            System.out.print(B[i]);
        }
        
        
        for(int x:B)
        {
            System.out.print(x++);
        }
        for(int x:B)
        {
            System.out.println(x);
        
        }
        
        for(int i=0;i<B.length;i++)
        {
            System.out.println(B[i]++);
        }
        
        
        System.out.println(B.length);
    }
    
}  

