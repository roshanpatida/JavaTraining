/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section16;

/**
 *
 * @author roshan_patidar
 */

class Test
{
    static int x=10;
    int y=20;
    
    void show()
    {
        System.out.println(x+" "+y);
    }
    
    static void display()
    {
        System.out.println(x);
    }
}

public class StaticAndFinal {

    public static void main(String[] args) {
        
        Test t1=new Test();
        t1.show();
        t1.x=30;
        t1.y=50; 
        
        Test t2=new Test();
        t2.show();
        
    }
    
}

