/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25_collection.com;

import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author roshan_patidar
 */
public class TreeSetDemo {
    




// its not allow duplicate values

    public static void main(String[] args) {
        
        TreeSet<Integer> ts=new TreeSet<>(List.of(10,30,50,70,10,40));
         TreeSet<Integer> ts1=new TreeSet<>(List.of(10,30,50,70,10,40));
        ts.add(25);
        System.out.println(ts.ceiling(24)); //print highest nearest value
        //ts.ceiling(55);
        System.out.println(ts.contains(25));/// availability
        System.out.println(ts.floor(24));// lowest nearest value
        System.out.println(ts.pollFirst());
        System.out.println(ts.descendingIterator()); // i dont know 
        System.out.println("ddd"+ts.headSet(55)); // print elements before 30 
        System.out.println("rosjs "+ ts.headSet(40, true)); // // print till 40 and also print before all the elements of this list
        System.out.println("11"+ts.subSet(25, 60));// print between them 
       System.out.println("b"+ts);
        System.out.println("hello"+ ts.lower(55));// print the lower element of this mentioned element 
        System.out.println("hy"+ ts.higher(55));// print the higher value of this mentioned value 
        System.out.println(ts.spliterator());// print one by one just work as a intetor like traverse
        ts.clear();
        System.out.println(ts.isEmpty());
        ts.addAll(ts1);
        System.out.println(ts);  
        System.out.println(ts.descendingSet()); // print element in desending order
        ts.parallelStream();
        System.out.println(ts);// print same as store elements
        System.out.println(ts.last());
        System.out.println(ts.tailSet(50)); // after the limits alements 
        System.out.println(ts.tailSet(30, true));// after the limits elements
        System.out.println(ts.size());
    }
    
}