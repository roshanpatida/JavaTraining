/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section6_predefined_functional_interfaces_predicate;

import java.util.Scanner;
import java.util.function.Predicate;

/**
 *
 * @author roshan_patidar
 */

class User{
    String username;
    String pass;
    

User(String username,String pass ){
this.username=username;
this.pass=pass;
}}
public class ProgramForUserAuthorization {
    public static void main(String[] args) {
        Predicate<User> p= user->user.username.equals("Roshan")&&user.pass.equals("hum");
        Scanner sc= new Scanner(System.in);
         System.out.println("Enter User Name");
String username= sc.next();
        System.out.println("Enter password");
        String pass=sc.next();
        
        User s= new User(username,pass);
        if(p.test(s)){
            System.out.println("--valid User-- ");
        }
        else {
            System.out.println("Please Enter  your Correct username and password  ");
           
        }
       
    }
    
}
