/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25_collection.com;

/**
 *
 * @author roshan_patidar
 */

import java.util.LinkedHashMap;
import java.util.Map;

 
    

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */





/**
 *
 * @author roshan_patidar
 */


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author roshan_patidar
 */

    // its having extra feature compared to hashamap beacouse its store value and keys also in the
//hashtable and values are inserted and deleted by using hash function x%10
//basacally is storage resuo is 50% - 50% it mean we can store value in 50% area and other 50% is empty 
//but we can adjust it into  75% - 25%
// its maintain  order of elements 

//LinkedHashset is mainly use for implements cache memery it work  lije cache object for us.
//if we have 10 size limit and we want to add more elements so it will be deleted first element and 
// adjust it 
// Linkedhashmap  used LRU for maintain order elements
//it take more time to excution

// one more thing it have its have two pointer which is next node and previous node 
// its related to doubly linkedlist
// add more elements at that time recently used elements is removed first
class LinkedHashMapDemo {
    public static void main(String[] args) 
    {    
        LinkedHashMap<Integer,String> tm=new LinkedHashMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));
        

//        tm.put(4,"E");
        tm.put(5,"F");
        
        
       
        // Entry mathod is avilable only map interface.
       
      
        System.out.println(tm); // print all the elements of the treemap
      
        System.out.println(tm.containsKey(5));// check avaibility
      
        System.out.println(tm.get(5));// get value
          
          System.out.println(tm.keySet());// print all the keys
          
          
           System.out.println(tm.isEmpty());// check is empty or not 
          
             System.out.println(tm.replace(3, "Roshan"));
             System.out.println(tm.replace(3, "D", "patidar"));
             System.out.println(tm.size());
             System.out.println(tm.values());// print only values
          
                System.out.println(tm.clone());
//               1 System.out.println(tm.compute(Integer.SIZE, remappingFunction)); // its not working
                 System.out.println(tm.putIfAbsent(4, "hello"));// if any value is not present so 
                                                                          // we can import on that perticular place
                 System.out.println(tm);
                 System.out.println(tm.getOrDefault(tm,"A"));// default value
                 
    }  
}