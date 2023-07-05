/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section7;

/**
 *
 * @author roshan_patidar
 */
public class LogicalOperator {
    public static void main(String[] args) {
        int n = 12;
        int n1 = 11;
        if(n >11 && n1<15)
        System.out.println("ANd operation");
    
    if(n1>14|| n1<1)
    {
        System.out.println("OR operation false");
    }
    if(n1>1 || n1<18)
    {
        System.out.println("OR operation True");
    }
}
}