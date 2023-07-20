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


public class Copying3 {
    public static void main(String[] args) {
        try{
            try{
                FileInputStream fin=new FileInputStream("/home/roshan_patidar/FileOutputStream/OutputStream.txt");
                FileOutputStream fout=new FileOutputStream("/home/roshan_patidar/FileOutputStream/Destination.txt");
                int a;
                while((a=fin.read())!=-1){
                    fout.write(a);
                }
            }catch(Exception e){}
        }catch(Exception e){}
        try{
            try(FileInputStream fin3=new FileInputStream("/home/roshan_patidar/FileOutputStream/Destination.txt")){
                byte[] b=new byte[fin3.available()];
                fin3.read(b);
                String str=new String(b);
                System.out.print(str);
            }
        }catch(Exception e){}
    }
}
