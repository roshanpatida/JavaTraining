/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section9;

/**
 *
 * @author roshan_patidar
 */
public class SecondLargest {
      public static void main(String[] args) 
    {
        int A[]={3,9,7,8,12,6,15,5,4,10};
        int max1,max2;
        
        max1=max2=A[0];
        
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>max1)
            {
                max2=max1;
                max1=A[i];
                
            }
            else if(A[i]>max2)
            {
                max2=A[i];
            }
        }
        
        System.out.println("Second Largest is "+max2);
        
        
        
    }
}
