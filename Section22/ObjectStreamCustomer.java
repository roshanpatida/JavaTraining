/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Section22;

/**
 *
 * @author roshan_patidar
 */
import java.io.*;


class Customer implements Serializable
{
    String custId;
    String name;
    String phone;
    
    static int count=1;
    Customer(){}
    Customer(String n,String p ){
        custId = "C"+count;
        count++;
        name=n;
        phone=p;
   }
    public String toString(){
        return "CustId"+custId+"\nName"+name+"Phone No."+phone;
               
    }
}

public class ObjectStreamCustomer {
    public static void main(String[] args)throws Exception {
        Customer list[]={new Customer("Smith","7698845452"),new Customer("Roshan","76974823442"),new Customer("Abhigyan","88785412452")};
        FileOutputStream fos= new FileOutputStream("/home/roshan_patidar/FileOutputStream/PrintStream.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeInt(list.length);
        for(Customer c:list){
            oos.writeObject(c);
            oos.close();
            fos.close();
        }
        
               
        
    }
   
}
