/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package section13_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author roshan_patidar
 */
public class Collect_Method_Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> l = new ArrayList<String>();
        l.add("he");
        l.add("w");
        l.add("aryan");
        l.add("shorya");
        l.add("harshit");
     
        
        
        //---------------------------------------------------------------------
        System.out.println(l);//stream() method present in collection interface
        List<String> l1=l.stream().filter(i->i.length()>=3).collect(Collectors.toList());
        System.out.println(l1);
        // in this porgram stream() method is process the gruop of objects which is present in the collction.
        // and filter() is check conditional statement and perfome operation  its related to predicate
        // collect() method is collect the elements from the stream and adding to the spacified collection 
        //
         List<String> l2=l.stream().map(i->i.toUpperCase()).collect(Collectors.toList());
        System.out.println(l2);
    }
    
}
