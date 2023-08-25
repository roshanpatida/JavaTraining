/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section14_DateAndTimeAPI;
import java.time.LocalDate;
/**
 *
 * @author roshan_patidar
 */
public class Period_And_Year {
    public static void main(String[] args) {
        
    
    LocalDate today=LocatDate.now();
   LocalDate birthday=LocalDate.Of(2000,2,16);
   
Period p = Period.between(birthday,today);
}}