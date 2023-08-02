/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section26_dataandtimeapi.com;

/**
 *
 * @author roshan_patidar
 */


import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoField;
public class DateTimeFormatterClass {
    public static void main(String[] args) {
        LocalDateTime d=LocalDateTime.now();
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(df.format(d));
        DateTimeFormatter df1=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(df1.format(d));
        DateTimeFormatter df2=DateTimeFormatter.ofPattern("dd/yyyy/yyyy HH:mm:ss");
        System.out.println(df2.format(d));
        DateTimeFormatter df3=DateTimeFormatter.ofPattern("dd/yyyy/mm HH:mm:ss");
        System.out.println(df3.format(d));
        System.out.println(d.get(ChronoField.YEAR));
        System.out.println(d.get(ChronoField.MINUTE_OF_HOUR));//
        System.out.println(d.get(ChronoField.DAY_OF_YEAR)); // 209
        System.out.println(d.get(ChronoField.YEAR_OF_ERA));// 2023
    }
}