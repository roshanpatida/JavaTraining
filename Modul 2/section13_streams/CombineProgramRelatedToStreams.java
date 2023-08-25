/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section13_streams;

import java.util.ArrayList;

/**
 *
 * @author roshan_patidar
 */
public class CombineProgramRelatedToStreams {
    public static void main(String[] args) {
       ArrayList<Integer> l = new ArrayList<Integer>();
       l.add(10);
       l.add(20);
       l.add(23);
       l.add(39);
        System.out.println(l);
       ArrayList<String> l1=new ArrayList<String>();
       l1.add("Hello");
       l1.add("Sushmita");
       l1.add("Roshan");
       l1.add("Harshit");
        System.out.println(l1);
        long count=l1.stream().filter(s->s.length()>=5).count();
        System.out.println(count);
        if(count == 4){
           l.stream().forEach(s->System.out.println(l1)); 
        }
        else{
            System.out.println("NOT matching ");
        }
    }
}
