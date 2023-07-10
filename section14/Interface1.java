package section14;

class Ram{
    public void ram(){System.out.println("hello"); 
    }
       
}
interface Main1{
    public void main1();
       
    
  
    }
    interface Main2{
        public void main2();
           }
        
class Shyam extends Ram implements Main1,Main2{

    @Override
    public void main1() {
        System.out.println("main1 method");
    }

    @Override
    public void main2() {
        System.out.println("main2 method");   
    }
   
}

public class Interface1{
    public static void main(String[] args) {
        Main1 sc = new Shyam();
        sc.main1();
    }
    
}
