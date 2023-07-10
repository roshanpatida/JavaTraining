package section16;

class Test12
{
    static
    {
        System.out.println("Block 1");
    }
    
    static
    {
    System.out.println("Block 2");
    }
}

public class StaticBlock {

    
    
    /*static
    {
        System.out.println("Block 1");
    }*/
    
    
    public static void main(String[] args) 
    {
        Test12 t=new Test12();
        System.out.println("Main");
//        Test12 t=new Test12();
    }
    
    /*static
    {
    System.out.println("Block 2");
    }*/
    
}