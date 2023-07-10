/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section18;

/**
 *
 * @author roshan_patidar
 */

class NegativeDimensionException extends Exception
{
    @Override
    public String toString()
    {
        return "Dimensions of a Rectangle cannot be Negative";
    }
}

public class ThrowAndThrows 
{
    static int area(int l,int b) throws NegativeDimensionException
    {
        if(l<0 || b<0)
            throw new NegativeDimensionException();
        return l*b;
    }
    static void meth1() throws NegativeDimensionException
    {
        System.out.println("Area is "+area(10,5));
    }
    
    public static void main(String[] args) 
    {
        try
        {
        meth1();
        }
        catch(NegativeDimensionException e)
        {
            System.out.println(e);
        }
        System.err.println("hi");
    } 
}

