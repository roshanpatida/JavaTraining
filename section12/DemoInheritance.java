/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section12;

/**
 *
 * @author roshan_patidar
 */
class Circle
{
    public double radius;
    
    public double area()
    {
        return Math.PI * radius *radius;
    }
    
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double circumference()
    {
        return perimeter();
    }
}

class Cylinder extends Circle
{
    public double height;
    
    public double volume()
    {
        return area()*height;
    }
    
}








public class DemoInheritance 
{

       public static void main(String[] args) 
       {
           Cylinder c=new Cylinder();
          
           c.radius=7;
           c.height=10;
           
           System.out.println("Volume "+c.volume());
           System.out.println("Area "+c.area());
          
       }
    
}

    

