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
public class OutputStreamWriteLimit {
    public static void main(String[] args) throws Exception  {
        FileOutputStream fos = new FileOutputStream("/home/roshan_patidar/FileOutputStream/OutputStream.txt");
        String str = "Hello Sawita";
      byte b[]=str.getBytes();
          fos.write(b,2, str.length()-3);
        fos.close();
    }
}
