/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section15;

/**
 *
 * @author roshan_patidar
 */


class Outer3
{
    int x=10;
    static int y=20;
    
    static class My
    {
        public void show()
        {
            System.out.println(y);
        }
    }
    
    
}

public class LocalAndStaticInnerClass 
{
    public static void main(String[] args) 
    {
        Outer3.My m=new Outer3.My();
        m.show();

    }
    
}

    

