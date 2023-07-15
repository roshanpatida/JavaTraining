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
public class Copying2FilesIntoAnother {
    public static void main(String[] args)throws Exception{
try{
        FileInputStream fis1=new FileInputStream("/home/roshan_patidar/FileOutputStream/OutputStream/txt");
                FileInputStream fis2=new FileInputStream("/home/roshan_patidar/FileOutputStream/Output/txt");
        
    FileOutputStream fos = new FileOutputStream("/home/roshan_patidar/FileOutputStream/Destination/txt");
    SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
    int b;
    while((b=sis.read())!=-1){
        fos.write(b);
    
    }
    
    fis1.close();
    fis2.close();
    fos.close();
    sis.close();
}
catch(FileNotFoundException e){
    System.out.println(e);
}
}
}