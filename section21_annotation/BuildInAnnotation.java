/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section21_annotation;

/**
 *
 * @author roshan_patidar
 */

/*
//@FunctionalInterface
Interface MyDemo{
public void main();
public int  show(int n,int m )

}*/

class A
{
    public void display()
    {
        
    }
}

class B extends A
        /*
        
        */
        
/*{
        ------just for understanding -----
        public void dispald(){}  // in this line i write wrong override method so @override is clarify us to regarding this mistaks
        
        
}*/
{
    @Override
    public void display()
    {
        
    }
    /* 
    Deprecated is usefor remove method for future it means we can not use deprecated allocated method
    
    
    */
    @Deprecated
    public void show()
    {
        
    }
    
}

public class BuildInAnnotation 
{
    
    public static void main(String[] args) 
    {
        int i;
        /*
        {
@ SuperssWarning is use for Deprecated and Unchecked (its define us to that it is throw error )       
        }
*/
        @SuppressWarnings("deprecation")

        B b=new B();
  
        b.show();
    }
    
}