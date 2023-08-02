/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25_collection.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 *
 * @author roshan_patidar
 */
public class PropertiesDemo {
    
// collection of keys and values
    // it store value only in the form of string 
    //it also store keys in the form of string
    //we can store value in the file through the help of properties
    
    
    
    public static void main(String[] args) throws Exception
    {
        Properties p=new Properties();
        
        p.setProperty("Brand", "Dell");
        p.setProperty("Processor", "i7");
        p.setProperty("OS", "Windows10");
        p.setProperty("Model", "Latitude");
        
        
//        p.storeToXML(new FileOutputStream("/home/roshan_patidar/FileOutputStream/Output.xml"), "Laptop");
        
        p.store(new FileOutputStream("/home/roshan_patidar/FileOutputStream/Output.txt"),"Laptop");
        p.load(new FileInputStream("/home/roshan_patidar/FileOutputStream/Output.txt"));
        
        System.out.println(p);
               
    }  
}