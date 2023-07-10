/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section7;
import java.util.*;
/**
 *
 * @author roshan_patidar
 */
public class FindDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for the check day of the number");
        int num = sc.nextInt();
        if(num==1){
            System.out.println("Monday");
        }
        else if(num ==2){
            System.out.println("Tuesday");
        }
        else if(num ==3){
            System.out.println("Wednesday");
        }
        else if(num ==4){
            System.out.println("Thusday");
        }
        else if(num ==5){
            System.out.println("Friday");
        }
        else if(num ==6){
            System.out.println("Saterday");
        }
        else if(num==7){
            System.out.println("Sunday");
        }
    }
   
}
