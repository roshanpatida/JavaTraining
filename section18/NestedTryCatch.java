/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section18;

/**
 *
 * @author roshan_patidar
 */

public class NestedTryCatch {
    public static void main(String[] args) {
        try{
            int A[] = {1,0,2,5,4};
            
                try{
                   int r= A[0]/A[1];
                    System.out.println(r);
                            }
                            catch(Exception e){
                                    System.out.println(e.getMessage());
                                    }
                
                System.out.println(A[10]);
            }
                  
                catch(Exception e){
                    System.out.println(e);
            }
        
    
    
    }}
