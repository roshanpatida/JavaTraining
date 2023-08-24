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
public class Count_Method_Demo {
    public static void main(String[] args) {
        ArrayList<String> l= new ArrayList<String>();
        l.add("he");
        l.add("w");
        l.add("aryan");
        l.add("shorya");
        l.add("harshit");
        System.out.println(l);
        long count =l.stream().filter(s->s.length()>=3).count();
        System.out.println("The number of string whose length >=3 :" +count);
    }
}
