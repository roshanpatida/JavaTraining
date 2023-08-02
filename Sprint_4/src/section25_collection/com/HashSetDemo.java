/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25_collection.com;

import java.util.HashSet;

/**
 *
 * @author roshan_patidar
 */
public class HashSetDemo {
    



// Normal hashig is remove and add operation through the x%10 and 0.75

    public static void main(String[] args) {
        // when we want to execute remove and add operation in constant time so hashset is used on that time.
        HashSet<Integer> hs=new HashSet<>(1000,0.75f);
        
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(11);
        hs.add(1);
        hs.add(10);
         // its note not allow duplicate values. it means store unique values
         // its take remender of the element and store on same place then if remender of element is 
         // same so that is stor on the next place of the already sotored element 
         // so this process contiue with elements remender based
         // and searching process is also exedute with same process
         // but we having two table one is open addressing and second is chaining
         // OPEN ADDRESSING - we store the element on different - different bucket
         // CHAINING  - We store elements in same  bucket
         //LOADING FACTOR - it is balanced storage which have some space criteria 75%  storage for value  
         // 25%  storage is for space or blank
         //
        System.out.println(hs);
        System.out.println("===============");
        for(int i =0;i<50;i++){
            hs.add(i);
            
        }
        System.out.println(hs);
    }
    
}