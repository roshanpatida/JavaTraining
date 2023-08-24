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
public class FilterDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(0);
        l.add(14);
        l.add(15);
        l.add(90);
        l.add(7);
        
        List<Integer> l2=new ArrayList<Integer>();
        for(Integer I : l){
            if(I%2==0){
                l2.add(I);
            }
        }
        System.out.println(l2);
        //---------------------------------------------------------------------
        System.out.println(l);//stream() method present in collection interface
        List<Integer> l1=l.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(l1);
        // in this porgram stream() method is process the gruop of objects which is present in the collction.
        // and filter() is check conditional statement and perfome operation  its related to predicate
        // collect() method is collect the elements from the stream and adding to the spacified collection 
        //
    }
    
}
