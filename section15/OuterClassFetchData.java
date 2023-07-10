/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section15;

import section15.Outer.Inner;

/**
 *
 * @author roshan_patidar
 */



class Outer1
{
    static int x=10;
   
    
    class Inner1
    {
        int y=20;
        public void innerDisplay()
        {
            System.out.println(x+" "+y);
        }
    }
    
    public void outerDisplay()
    {
        
      
        System.out.println("hello");
        
    }
}

public class OuterClassFetchData {

    public static void main(String[] args) 
    {
       Outer.Inner oi=new Outer().new Inner();
       oi.innerDisplay();
        
    }
    
}


