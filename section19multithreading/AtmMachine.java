/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section19multithreading;

/**
 *
 * @author roshan_patidar
 */
class ATM{
   synchronized public void checkBalance(String name){
        System.out.println(name +"Checking");
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Balance");
    }
   synchronized public void withdraw(String name, int amount){
        System.out.println(name + "Withrowing");
        try{
            Thread.sleep(1000);
            
        }
        catch(Exception e){
            
        }
        System.out.println("amount");
        
        
    }
    
    
}
class Customer extends Thread{
    String name;
    int amount;
    ATM atm;

    Customer(String n, ATM a, int amt){
name = n;
atm = a;
amount = amt;
    }
    public void useATM(){
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }
    @Override
    public void run(){
        useATM();
    }}
public class AtmMachine {
    public static void main(String[] args) {
        
    
    ATM atm = new ATM();
    Customer c1 = new Customer("Roshan",atm,100);
    Customer c2 = new Customer("Pranesh",atm,200);
    c1.start();
    c2.start();
    
}
}