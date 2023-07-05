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
public class FindWebsiteUsingSwitchCase {
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
   String ext =url.substring(url.lastIndexOf(".")+1);
  switch(ext){
      case "com": System.out.println("Commercial");
      break;
      case "org": System.out.println("Organization");
      break;
      case "net": System.out.println("Network");
      break;
            
  }
        
    
   }
}
