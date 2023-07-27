/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25_collection.com;

import java.util.LinkedHashSet;
import java.util.List;

/**
 *
 * @author roshan_patidar
 */


import java.util.*;

public class LinkedHashSetDemo 
{
//Maintain order of elenments 
    //store just value
    //not allows multiple values
    // its not sorted
    public static void main(String[] args) 
    {
        LinkedHashSet<String> lhs=new LinkedHashSet<>(10);
        
        lhs.add("A");
        lhs.add("C");
        lhs.add("E");
        lhs.add("K");
        lhs.add("B");
        lhs.add("G");
        lhs.add("B");
        
        Iterator<String> itr=lhs.iterator();
        
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
       
        
    }   
}
