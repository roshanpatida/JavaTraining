/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25_collection.com;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author roshan_patidar
 */
public class LinkedHashMapWithCache {
    

    public static void main(String[] args) 
    {

// its maintain removal order
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>(5){
            
            @Override
            protected boolean removeEldestEntry(Map.Entry e)
            {
                return size()>5; // it will be access as a cache momory
                
            }
        };
        // removed recenlty use elements
        
        lhm.put(1,"A");
        lhm.put(2,"B");
        lhm.put(3,"C");
        lhm.put(4,"D");
        lhm.put(5,"E");
        String s=lhm.get(2);
        s=lhm.get(5);
        s=lhm.get(1);
        lhm.put(6,"F");
        
        lhm.forEach((k,v)->System.out.println(k+" "+v));
        
    }   
}