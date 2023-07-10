/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section8;

/**
 *
 * @author roshan_patidar
 */
public class SumOfTheNumber {
    public static void main(String[] args) {
        int num = 1738;
        int rem =0;
        int sum = 0;
        while(num>0){
            rem= num%10;
            sum  = sum+ rem;
            num= num/10;
        }
        System.out.println("sum is " + sum);
    }
}
