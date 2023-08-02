/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section26_dataandtimeapi.com;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 *
 * @author roshan_patidar
 */
// its abstract class 
public class CalendarClass {
    public static void main(String[] args) {
        GregorianCalendar gc=new GregorianCalendar();
        System.out.println(gc.isLeapYear(2020));
        System.out.println(gc.getCalendarType()); // gregory
        System.out.println(gc.getGreatestMinimum(12));
        System.out.println(gc.getFirstDayOfWeek());
        System.out.println(gc.get(Calendar.DATE));
        System.out.println(gc.get(Calendar.MONTH));
        System.out.println(gc.get(Calendar.AM));
        System.out.println(gc.get(Calendar.DAY_OF_MONTH));
        System.out.println(gc.get(Calendar.HOUR));
        System.out.println(gc.get(Calendar.WEEK_OF_YEAR));
        System.out.println(gc.get(Calendar.ZONE_OFFSET));// not print perfect
        System.out.println(gc.get(Calendar.SHORT_FORMAT));// print year
        
        System.out.println(gc.get(Calendar.DAY_OF_WEEK_IN_MONTH)); // print 4 because it print in integer      
        
            // timeZone class
        
        TimeZone tz=gc.getTimeZone();
        System.out.println(tz.getDisplayName()); // print  india standard time 
        System.out.println(tz.getOffset(25));// it is address of country
        System.out.println(tz);
    }
}
