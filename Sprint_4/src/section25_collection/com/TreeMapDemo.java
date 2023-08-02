/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25_collection.com;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 *
 * @author roshan_patidar
 */
public class TreeMapDemo {
    

// treemap is based on redblack tree and its having key and value which take log(n) time for execution
   // keys are taken as mapping
    // map is store value in the form of key and values.
    public static void main(String[] args) 
    {    
        TreeMap<Integer,String> tm=new TreeMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));
        

//        tm.put(4,"E");
        tm.put(5,"F");
        
        
        Entry<Integer,String> e=tm.firstEntry(); // its fatch the entry data it means first number key and element
        // Entry mathod is avilable only map interface.
        System.out.println(e.getKey()+" "+e.getValue()); // print first key and value 
        System.out.println(tm.ceilingEntry(4));// its print the equal value of greater value of mentioned key
        System.out.println(tm); // print all the elements of the treemap
        System.out.println(tm.ceilingKey(4));// its print only key which is greater and equal
        System.out.println(tm.containsKey(5));// check avaibility
        System.out.println(tm.floorEntry(4));// print less or equal
        System.out.println(tm.floorKey(4)); // print lessthen or equal key 
        System.out.println(tm.descendingKeySet()); // print desceanding order
        System.out.println(tm.descendingMap());// print full map means key and value both
        System.out.println(tm.get(5));// get value
        System.out.println(tm.headMap(2));// print top map but less than this key(key and value)
          System.out.println(tm.headMap(2, true));// print top map with mentioned key
          System.out.println(tm.keySet());// print all the keys
          System.out.println(tm.higherEntry(4));// print next of mentioned with key and value
           System.out.println(tm.higherKey(4));// print next key 
           System.out.println(tm.isEmpty());// check is empty or not 
           System.out.println(tm.lastEntry());// print last entry
           System.out.println(tm.lastKey());// print last key
           System.out.println(tm.lowerEntry(4));// print previous key and value
           System.out.println(tm.lowerKey(4));// print privious key only 
             System.out.println(tm.replace(3, "Roshan"));
             System.out.println(tm.replace(3, "D", "patidar"));
             System.out.println(tm.size());
             System.out.println(tm.subMap(1, 3));// print between  1 to 3 means 3 is not include
             System.out.println(tm.subMap(1, true, 3, false));// same as old
             System.out.println(tm.tailMap(2));// print map of 2 to till last
             System.out.println(tm.tailMap(3, true));// same 
             System.out.println(tm.values());// print only values
             
    }  
}