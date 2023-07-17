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
public class ByteArray {
    public static void main(String[] args)throws Exception {
       
            
        
     ByteArrayOutputStream bos=new ByteArrayOutputStream();
     bos.write('a');
      bos.write('b');
       bos.write('c');
        bos.write('d');
       bos.writeTo(new FileOutputStream(""));
       bos.close();
    }
}
