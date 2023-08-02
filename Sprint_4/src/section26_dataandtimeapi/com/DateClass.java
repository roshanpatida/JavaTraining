/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section26_dataandtimeapi.com;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author roshan_patidar
 */
public class DateClass {
    public static void main(String[] args) {
        
    
Date d= new Date("7/07/2020");
Date d1= new Date("7/07/2020");
Time s=new Time(12);
        System.out.println(s);
        System.out.println("Find day: " + d);
        System.out.println(d.getYear()); // without 1900 we get 120 
        System.out.println(d.getYear()+1900);
        System.out.println(d.after(d));// found the after date is true of false
        System.out.println(d.clone());// copy existing date
        System.out.println(d.compareTo(d1));// if true return 0, false return 1
        System.out.println(d.getTime());
        System.out.println(d.toGMTString());// print the before date of mentioned date 
        d.setTime(25);// without settime its print 07 jul 2020
        System.out.println(d);// print jan 01 5:30 1970 
    }
}
