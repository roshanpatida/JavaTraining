/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section12;

/**
 *
 * @author roshan_patidar
 */



class Car
{
    public void start(){System.out.println("Car Started");}
    public void accelerate(){System.out.println("Car is Accelerated");}
    public void changeGear(){System.out.println("Car Gear Changed");}
    
}

class LuxaryCar extends Car
{
    @Override
    public void changeGear(){System.out.println("Automatic Gear");}
    public void openRoof(){System.out.println("Sun Roof is Opened");}
    
}

public class MethodOverriding3 
{

    public static void main(String[] args) 
    {
        Car c=new LuxaryCar();
       
        c.start();
        c.accelerate();
        c.changeGear();
// its depends on reference variable 
    }
    
}
