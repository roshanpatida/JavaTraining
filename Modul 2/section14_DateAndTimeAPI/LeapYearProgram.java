/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section14_DateAndTimeAPI;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author roshan_patidar
 */
public class LeapYearProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter your digit");
        int n = sc.nextInt();
        Year y = Year.of(n);
        if(y.isLeap()){
            System.out.println("Leap year");
        }
        else {
            System.out.println("not leap  year ");
        }
     
    }
 
}
