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
public class FindRedixOfNumber {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);      
  String num;
  
  System.out.print("Enter a number");
  num = sc.nextLine();
  if(num.matches("[01]+")){
      System.out.println("Binary Radix=2");
  }
  else if(num.matches("[0-7]+")){
      System.out.println("Octal radix=8");
  }
  else if(num.matches("[0-9]+")){
      System.out.println("Decimal Radix = 10");
  }
  else if(num.matches("[0-9A-F]+")){
      System.out.println("Hexa Radix=16");
          }
  else {
      System.out.println("Not a number");
  }}
}
