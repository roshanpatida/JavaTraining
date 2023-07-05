/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section7;
import java.util.*;
import java.lang.*;
/**
 *
 * @author roshan_patidar
 */
public class FindWebsiteType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter website");
        String url = sc.nextLine();
        String protocol = url.substring(0,url.indexOf(":")); 
   if(protocol.equals("http")){
       System.out.println("hyper text transfer protocol");
   }
   else if(protocol.equals("ftp")){
       System.out.println("file trasfer protocol");
       
   }
   String ext =url.substring(url.lastIndexOf("."));
   if(ext.equals("com")){
       System.out.println("Commercial");
   }
   else if(ext.equals("org")){
       System.out.println("Organization");
   }
   else if(ext.equals("net")){
       System.out.println("Network");
   }
        
    
   }
}
