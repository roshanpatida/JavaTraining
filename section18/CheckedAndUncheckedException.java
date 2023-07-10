/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section18;

/**
 *
 * @author roshan_patidar
 */


class LowBalanceException3 extends Exception
{
    @Override
    public String toString()
    {
        return "Balance Should not be less than 5000";
    }
}

public class CheckedAndUncheckedException 
{
    static void fun1()
    {
        try
        {
            throw new LowBalanceException3();
        }
        catch(LowBalanceException3 e)
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
