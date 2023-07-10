/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section9;

/**
 *
 * @author roshan_patidar
 */
public class LengthArray {
    

    public static void main(String[] args) 
    {
        int A[]={8,6,10,9,2};
        
        System.out.println("Length of A="+A.length);
        
        int B[]=new int[10];
        
        for(int i=0;i<A.length;i++)
        {
            B[i]=A[i];
        }
        A=B;
        for(int i=0;i<A.length;i++){
        System.out.println(A[i]);
        }
        System.out.println("Length of A="+A.length);
        
    }
    
}
