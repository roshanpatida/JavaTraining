/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section22_iostreams;
import java.io.FileReader;
import java.io.BufferedReader;
/**
 *
 * @author roshan_patidar
 */
public class BufferReader {
    public static void main(String[] args)throws Exception  {
        FileReader fis=new FileReader("/home/roshan_patidar/FileOutputStream/Destination.txt");
        BufferedReader bis=new BufferedReader(fis);
        
               System.out.print((char)bis.read());
               System.out.print((char)bis.read());
               
               System.out.print((char)bis.read());
               bis.mark(10);
               
               System.out.print((char)bis.read());
               System.out.print((char)bis.read());
               bis.reset();
              System.out.print((char)bis.read());// its print the remaining data which is hold in buffer.
              System.out.print((char)bis.read());
              System.out.print((char)bis.read());
              
            System.out.println( bis.readLine()); // its print full string and it is present only BufferReader(); 
    }
}
