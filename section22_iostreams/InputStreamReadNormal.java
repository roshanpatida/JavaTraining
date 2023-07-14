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
public class InputStreamReadNormal {
    public static void main(String[] args)throws Exception  {
        FileInputStream fis  = new FileInputStream("/home/roshan_patidar/FileOutputStream/OutputStream.txt");
        int x;
        do{
            x=fis.read();
            System.out.print((char)x);
        }
        while(x!=-1);
        
    }
   
}
