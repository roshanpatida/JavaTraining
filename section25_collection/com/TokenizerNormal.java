/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25_collection.com;

import java.util.StringTokenizer;

/**
 *
 * @author roshan_patidar
 */
public class TokenizerNormal {
    public static void main(String[] args) {
        String data="nmae=vijay,Address=Indore,Country=india,dept=CSE";
        StringTokenizer stk = new StringTokenizer(data,"=;");
        System.out.println(stk.countTokens());
        
        String s;
        while(stk.hasMoreTokens()){
            s=stk.nextToken();
            System.out.println(s);
        }
    }
   
}
