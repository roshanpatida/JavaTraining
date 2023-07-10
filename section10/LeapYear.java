/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section10;
import java.util.Scanner;
/**
 *
 * @author roshan_patidar
 */
public class LeapYear {
    static void leap(int year){
     if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("leap year");
                }else
                {
                    System.out.println("Not leap year");
                       
                }
            }
            else{System.out.println("leap year");
        }
            
    }
else{
            System.out.println("Not leap year");
        }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year ");
        int n = sc.nextInt();
        leap(n);
    }
}
