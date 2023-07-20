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


public class CharArrayReader
{

    public CharArrayReader(char[] c) {
    }
    public static void main(String[] args) throws Exception
    {
        
        char c[]={'a','b','c','d','e','f','g','h','i','j'};
        
        CharArrayReader cr=new CharArrayReader(c);
        
        int x;
        
        while((x=cr.read())!=-1)
        {
            System.out.print((char)x);
            
        }
        
        cr.close();
        
    }

    private int read() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void close() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


   
}