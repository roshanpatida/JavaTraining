/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section16;

/**
 *
 * @author roshan_patidar
 */


class Test13 {
    public final void show()
    {
        System.out.println();
    }
}

class Test14 extends Test13
{
    //public void show(){}
    //gives error as final methods cannot be overloaded.
}

public class FinalKeyword {

//    final float PI;
//    
//    public FinalKeyword
//    {
//        PI=3.1425f;
//    }
    
    public static void main(String[] args) {
        
        final float PI;
        PI=3.1425f;
        System.out.println(PI);
        
    }
    
}

