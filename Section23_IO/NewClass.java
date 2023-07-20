/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Section22;

/**
 *
 * @author roshan_patidar
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.*;
/**
 *
 * @author roshan_patidar
 */
public class NewClass {
    public static void main(String[] args) throws IOException {
     
            
        
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream(20)) {
            bos.write('a');
            bos.write('b');
            bos.write('c');
            bos.write('d');
            byte b[] = bos.toByteArray();
            for(Byte x:b){
                
                System.out.println(x);
            }
        }
        }
        }
        
    

