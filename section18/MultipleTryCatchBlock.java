/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section18;

/**
 *
 * @author roshan_patidar
 */
public class MultipleTryCatchBlock {
    public static void main(String[] args) {
        
        try{
        int A[] = {1,0,6,5,4};
        int r;
          System.out.println(A[10]);
           r= A[0]/A[1];
          System.out.println(r);
        
        }
        catch(ArithmeticException e){
            System.out.println(e);
          
            
        }
        catch(Exception e){
            System.out.println(e);
        }
       
    }}

