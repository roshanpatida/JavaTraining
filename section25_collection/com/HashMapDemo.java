/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25_collection.com;




/**
 *
 * @author roshan_patidar
 */

// in the hashmap it alos have key and values and its take constant time for execution o(1)
// elements does not sorted and its having one table where we store only values
//through the help of loading factor we spacify that and adjust 

//

    

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author roshan_patidar
 */

    public class HashMapDemo{

    public static void main(String[] args) 
    {    
        HashMap<Integer,String> tm=new HashMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));
        

//        tm.put(4,"E");
        tm.put(5,"F");
        
        // hasmap is not maintain the order of elements
       
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
                 System.out.println(tm.getOrDefault(tm, "A"));// default value 
    }  
}