/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayList_section_6;

import java.util.ArrayList;

/**
 *
 * @author roshan_patidar
 */
public class SearchingElement {
    public static void main(String[] args) {
      ArrayList<String> letter =new ArrayList<String>();
        letter.add("A");
                letter.add("A");
                        letter.add("b");
                                letter.add("c");
                                        letter.add("D");
                                      for(String Alpha:letter){
                                          if(Alpha.equals("b")){
                                              System.out.println("The element is found");
                                              break;
                                          }
                
            }
                                      int index =letter.indexOf("b");
                                      System.out.println("The element is fount at index : "+index);
        }
    
}
