/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section26_dataandtimeapi.com;

/**
 *
 * @author roshan_patidar
 */

import java.util.*;
import java.time.*;
public class DateTimeAll {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis()/1000);//sec
        System.out.println(System.currentTimeMillis()/1000/60/60);//hr
        System.out.println(System.currentTimeMillis()/1000/60/60/24);//days
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);//year
        Date d=new Date();
        System.out.println(d);
        System.out.println("Day "+d.getDay());
        System.out.println("Date "+d.getDate());
        System.out.println("Hours "+d.getHours());
        System.out.println("Min "+d.getMinutes());
        System.out.println("Sec "+d.getSeconds());
        System.out.println("Year "+d.getYear());
        System.out.println(d.getYear()+20);
        d.setDate(21);
        System.out.println(d.getDate());
        LocalDate d1=LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(d1);
        LocalDate d2=LocalDate.now();
        System.out.println(d2.getMonth());
        
        d2.minusDays(10); //its not iffect on the result mean we can put 10  or any thing 
        System.out.println("minusdays"+d2);
        Period p=Period.of(10, 0, 0);// make period
        System.out.println(p); //P10Y
        System.out.println(p.addTo((LocalDate.now()))); // add 10 year in
        
    }
}