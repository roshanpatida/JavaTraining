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
public class CopyingFile {
    public static void main(String[] args)throws Exception {
        try{
        FileOutputStream fos;
        try (FileInputStream fis = new FileInputStream("/home/roshan_patidar/FileOutputStream/OutputStream.txt")) {
            fos = new FileOutputStream("/home/roshan_patidar/FileOutputStream/Output2.txt");
            int b;
            while((b=fis.read())!=-1){
                if(b>65 && b<=90) fos.write(b+32);
                else fos.write(b);
                
            }
        }
        fos.close();
        
        }catch(FileNotFoundException e){
            System.out.println(e);}
    
   
    }
}
