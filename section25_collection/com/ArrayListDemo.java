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
        
        ArrayList<Integer> al2=new ArrayList<>(List.of(50,60,70,80,90));
        
        al1.add(10);// add element
        al1.add(0,5);// add element on fix indexing number 
        al1.addAll(al2);// add all element of exiting arraylist in the new arraylist
        al1.addAll(1,al2);//add elemene of existing list and it will start from fix indexing number 
        al1.add(5,70);// indexing saved element
        al1.set(6,100);// it used to replace that element and add new element on that place
        
    
        
        System.out.println(al1.contains(25));
        System.out.println(al1.get(5));
        System.out.println(al1.indexOf(70));
        System.out.println(al1.lastIndexOf(70));
        
        System.out.println(al1);
        
        for(int i=0;i<al1.size();i++)
            System.out.println(al1.get(i));
        
        for(Integer x:al1)
            System.out.println(x);
        
        for(Iterator<Integer> it= al1.iterator(); it.hasNext();)
        {
            java.lang.Integer x = it.next();
            System.out.println(x+ "fgdgf");
        }
        
        al1.forEach((x)->{
            System.out.println(x);
        });
        
        for(Iterator<Integer> it=al1.listIterator();it.hasNext();)
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
        
    }
    
    static void show(int n)
    {
        if(n>60)
            System.out.println(n);
    }
    

    
}
