/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25_collection.com;

import java.util.BitSet;

/**
 *
 * @author roshan_patidar
 */
public class BitSetDemo {
   // its perform as a bitwise operation
    // true =1, false=0
    // array of bites 
    // it use for check elements to present of not if present so it return true on that place 
    // and if it is not present so it will return false only on that placed 
    //from object check elements
    //it is not part of collection framework
    
    

    public static void main(String[] args) 
    {
        BitSet bs1=new BitSet();
        
        bs1.set(0);
        bs1.set(2);
        bs1.set(4);
        bs1.set(6);
        bs1.set(8);
           
        BitSet bs2=new BitSet();
       // bs2.set(0);
        bs2.set(1);
       // bs2.set(2);
        bs2.set(3);
       // bs2.set(4);
        bs2.set(5);
       // bs2.set(6);
        bs2.set(7);
       // bs2.set(8);
        // check the elements bitween them and which is not present 
        bs1.and(bs2); // fetch similer data
        bs1.or(bs2);// fatch one elements is available or not so it print that elements which is write first or which is first object
        
        bs1.flip(0,bs1.length());
        System.out.println(bs1);
        
        bs1.flip(0,bs2.length());
        System.out.println(bs2);
        
        
    }  
}