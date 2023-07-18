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

class Student1
{
    int rollno;
    String name;
    String dept;
}

public class SerialisationPrintStream
{
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fos=new FileOutputStream("/home/roshan_patidar/FileOutputStream/PrintStream.txt");
        PrintStream ps=new PrintStream(fos);
        
        
        Student1 s=new Student1();
        s.rollno=10;
        s.name="John";
        s.dept="CSE";
        
        ps.println(s.rollno);
        ps.println(s.name);
        ps.println(s.dept);
        
        ps.close();
        fos.close();
        
    }    
}
