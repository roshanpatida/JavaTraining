/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Section22;

/**
 *
 * @author roshan_patidar
 */

import java.io.*;

public class RandomAccessDemo 
{
    public static void main(String[] args) throws Exception
    {
        RandomAccessFile rf=new RandomAccessFile("/home/roshan_patidar/FileOutputStream/Destination.txt","rw");
       //byte b[]={'A','B','C','D','E','F','G''H','I','J'};
       
       
       
       // Random access is used for access any data through the help of random access 
       // we can perfom write and read both of this operation at a time
       // but in tne sequence access  we can perform only input or output and also doing access data 
       // sequensialy access data we can not access data randomly in the here. 
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        rf.write('d');
        System.out.println((char)rf.read());
        rf.skipBytes(3);
        System.out.println((char)rf.read());
        rf.seek(3);
        System.out.println((char)rf.read());
        System.out.println(rf.getFilePointer());
        rf.seek(rf.getFilePointer()+2);
        System.out.println((char)rf.read());

        

       
    }   
}