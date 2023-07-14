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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roshan_patidar
 */
public class InputStream {
    public static void main(String[] args) throws Exception  {
       FileInputStream fos = new FileInputStream("/home/roshan_patidar/FileOutputStream/OutputStream.txt");
//        String str = "Hello Braivire";
        byte b[]= new byte[fos.available()];

        fos.read(b);
        
        String str = new String(b);
        
        System.out.println(str);


        
      fos.close();
    }
}
