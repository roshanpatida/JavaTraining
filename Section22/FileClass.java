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

public class FileClass 
{
    public static void main(String[] args) throws Exception
    {
        // select path of any directory on you computer
       File f=new File("/home/roshan_patidar/FileOutputStream");
       
       System.out.println(f.isDirectory());
       File list[]=f.listFiles();
        
       for(File x:list)
       {
           System.out.println(x.getParent()+" "+x.getName());
       }
      
    }
}