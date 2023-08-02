/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25_collection.com;
import java.util.*;
/**
 *
 * @author roshan_patidar
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        
        ArrayList<Integer> al1=new ArrayList<>(20);
        
        ArrayList<Integer> al2=new ArrayList<>(List.of(50, 60, 70,80,90));
        
     
       al1.add(10);// add element
     System.out.print(" Add Element 10 in this arraylist"+al1);
         
        al1.add(0,5);// add element on fix indexing number 
        
        System.out.println("add elements in the place of 0 indexig and other elemets is adjust "+al1);
        al1.addAll(al2);// add all element of exiting arraylist in the new arraylist
        System.out.println(" add all elements of al2 arraylist in arraylist 1 :- " +al1);
        al1.addAll(1,al2);//add elemene of existing list and it will start from fix indexing number 
        System.out.println(" all elements of al2 arraylist in arraylist 1 from indexing 1 "+al1);
        al1.add(5,70);// indexing saved element
        
        System.out.println("add alements from indexing 5 "+ al1);
        al1.set(6,100);// it used to replace that element and add new element on that place
        System.out.print(" set elements in place of indexing 6 "+al1);
//        
    
        System.out.println("-------------------");
        
        for(Iterator<Integer> it=al1.listIterator();
                it.hasNext();)// give the condition mean check next value 
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        al1.clone();
        
        System.out.print(al1);
            
    }
    
    static void show(int n)
    {
        if(n>60)
            System.out.println(n);
    }
//    

    
}
