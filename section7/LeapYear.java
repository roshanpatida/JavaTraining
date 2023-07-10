/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section7;
import java.util.Scanner;
/**
 *
 * @author roshan_patidar
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
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
    }}