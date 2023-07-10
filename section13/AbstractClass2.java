package section13;

abstract class Bike
{
   abstract public void  name();
   abstract public void surname();
}

class Cycle extends Bike
{
    @Override
    public void name(){
        System.out.println("Name");
    }        
    public void surname(){
        System.out.println("Surname");
    }
}
        

public class AbstractClass2 
{
    
    public static void main(String[] args) {
    Cycle sc = new Cycle();
sc.name();
sc.surname();
    }  
}