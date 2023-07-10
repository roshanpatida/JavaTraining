/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section18;

/**
 *
 * @author roshan_patidar
 */



class LowBalanceException1 extends Exception
{
    public String toString()
    {
        return "Balance Should not be less than 5000";
    }
}

public class LowBalanceException 
{
    static void fun1()
    {
        try
        {
            throw new LowBalanceException1();
        }
        catch(LowBalanceException1 e)
        {
            System.out.println(e);
        }
    }
    
    static void fun2()
    {
        fun1();
    }
    
    static void fun3()
    {
        fun2();
    }
    
    public static void main(String[] args) 
    {
       fun3();
    }   
}

    

