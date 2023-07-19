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

class Student2 implements Serializable
{
    private int rollno;
    private String name;
    private float avg;
    private String dept;
    public static int Data=10;
    public transient int t;
    
    public Student2()
    {
        
    }
    public Student2(int r,String n,float a,String d)
    {
        rollno=r;
        name=n;
        avg=a;
        dept=d;
        Data=500;
        t=500;
    }
    
    @Override
    public String toString()
    {
        return "\nStudent Details\n"+
                "\nRoll "+rollno+
                "\nName "+name+
                "\nAverage "+avg+
                "\nDept "+dept+
                "\nData "+Data+
                "\nTransient "+t+"\n";
    }
    
}

public class SerialObjectStream 
{
//   public static void main(String[] args) throws Exception
//    {
//        FileOutputStream fos=new FileOutputStream("/home/roshan_patidar/FileOutputStream/PrintStream.txt");
//        ObjectOutputStream oos=new ObjectOutputStream(fos);
//        
//        Student2 s=new Student2(10,"John",89.9f,"CSE");
//        
//        oos.writeObject(s);
//        
//        fos.close();
//        oos.close();
//        
//    }
    
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis=new FileInputStream("/home/roshan_patidar/FileOutputStream/PrintStream.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        
        Student2 s=(Student2)ois.readObject();
        
        System.out.println(s);
        
        fis.close();
        ois.close();
        
    }
}