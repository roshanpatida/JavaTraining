/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Section22;

import java.io.*;

/**
 *
 * @author roshan_patidar
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author roshan_patidar
 */
public class NewClass1 {

    
    
    public static void main(String[] args)throws Exception {
        FileInputStream fis=new FileInputStream("/home/roshan_patidar/FileOutputStream/Destination.txt");
        BufferedInputStream bis= new BufferedInputStream(fis);
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(10);
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.reset();
        
        
         System.out.print((char)bis.read()); // its hold some data 
        System.out.print((char)bis.read());

        
        
    }
    
}
