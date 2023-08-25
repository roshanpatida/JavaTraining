/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section14_DateAndTimeAPI;
import java.time.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
/**
 *
 * @author roshan_patidar
 */
public class LocalDate {
    public static void main(String[] args) {
        LocalDate date =LocalDate.now();
        System.out.println("Current  Date  "+ date);
        LocalTime time =LocalTime.now();
        System.out.println("Current Time  "+time);
        
        int dd=date.getDayOfMonth(); // we get perticaluar value 0f day 
        int mm = date.getMonthValue();// saperatly month
        int yyyy=date.getYear();// saperatly year
        System.out.println(dd+".."+mm+".."+yyyy);
        System.out.printf("%d-%d-%d",dd,mm,yyyy);
        
     
    }  
}
