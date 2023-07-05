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
public class CheckGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks of three subjects");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        float average = (float)(n1+n2+n3)/3;
        if(average <=50 && average >=1){
            System.out.println("D");
        }
        else if(average <=60&& average>=51){
            System.out.println("C");
        }
        else if(average <= 70&& average>=61){
            System.out.println("B");
            
        }
        else if(average<=100&&average>=71){
            System.out.println("A");
        }else{
            System.out.println("E");
        }
    }
   
}
