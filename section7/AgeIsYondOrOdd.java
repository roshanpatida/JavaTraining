/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section7;
import java.util.*;
/**
 *45
 * @author roshan_patidar
 */
public class AgeIsYondOrOdd {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int n = sc.nextInt();
        if(n>=18 && n<=50){
            System.out.println("Young person");
        }else {
            System.out.println("not young");
        }
    }
}
