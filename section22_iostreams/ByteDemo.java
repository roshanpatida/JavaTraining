/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section22_iostreams;
import java.io.*;
/**
 *
 * @author roshan_patidar
 */


public class ByteDemo 
{
    public static void main(String[] args) throws Exception
    {
        
        byte c[]={'a','b','c','d','e','f','g','h','i','j'};
        
        ByteArrayInputStream bis = new ByteArrayInputStream(c);
        String str = new String(bis.readAllBytes());
        System.out.println(str);
                bis.close();
        
    }
}