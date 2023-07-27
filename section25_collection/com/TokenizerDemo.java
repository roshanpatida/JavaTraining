/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25_collection.com;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author roshan_patidar
 */
public class TokenizerDemo {
    
//Its having key and values in a single string and each keys and values  saperated in between by (;) 
    // each elements is saperated by (=) 
    // all the keys and values are stored in token and it create saperated token for each elements

    public static void main(String[] args) throws Exception
    {

        // File path must be valid
        FileInputStream fis=new FileInputStream("/home/roshan_patidar/FileOutputStream/Output.txt");
        byte b[]=new byte[fis.available()];
        fis.read(b);
        
        String data=new String(b);

//        String data="name=Vijay address=delhi country=india dept=cse";
    
        
        StringTokenizer stk=new StringTokenizer(data,",");
        
        String s;
        ArrayList<Integer> al=new ArrayList<>();
        
        while(stk.hasMoreTokens())
        {
            s=stk.nextToken();
            al.add(Integer.valueOf(s));
            
        }
        
        System.out.println(al);

    }
    
}