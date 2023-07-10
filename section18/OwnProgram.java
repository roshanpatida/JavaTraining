/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section18;
import java.util.*;
/**
 *
 * @author roshan_patidar
 */


class LowBalanceException4 extends Exception{
    @Override
    public String toString(){
        return "Balance should be 10000";
    }
}
public class OwnProgram {
    public static void main(String[] args) {
        System.out.println("Enter Balance");
        Scanner sc = new Scanner(System.in);
        int totalBalance=sc.nextInt();
       
        try{
            if(totalBalance<10000){
                throw new LowBalanceException4();
            }
            else{
                
                System.out.println("Total Balance "+totalBalance);
            }
        }
        catch(LowBalanceException4 e){
            System.out.println(e+"");
        }
    }
}