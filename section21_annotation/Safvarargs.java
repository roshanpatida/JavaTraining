/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section21_annotation;

/**
 *
 * @author roshan_patidar
 */
class My<T>{
    /*
 @SafeVarargs is use for define the variable argument in the method   
 
    
    */
    @SafeVarargs
    private void show(T...arg){
        for(T x:arg)System.out.println(x);
    }
            
}
public class Safvarargs {
    public static void main(String[] args) {
        
    }
    
}
