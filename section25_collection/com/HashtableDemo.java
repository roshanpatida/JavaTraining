/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25_collection.com;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author roshan_patidar
 */
public class HashtableDemo {
    

// it is same as map and it is a old class of java
    // it is not generic class and there is no iterator available
    //  we use enumeration for interation
  

    public static void main(String[] args) 
    {
        Hashtable<Integer,String> ht=new Hashtable<>();
        
        ht.put(1,"A");
        ht.put(2,"B");
        ht.put(3,"C");
        ht.put(4,"D");
        ht.put(5,"E");
        
        
        Enumeration e=ht.elements(); // enumeration is iterate all the elements 
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
        
        ht.computeIfAbsent(7, (k)->"Z"+k); // add one more element

        System.out.println(ht);
        
        
    }   
}