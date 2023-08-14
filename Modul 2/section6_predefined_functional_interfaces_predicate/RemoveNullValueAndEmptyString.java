/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section6_predefined_functional_interfaces_predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 *
 * @author roshan_patidar
 */
public class RemoveNullValueAndEmptyString {
    public static void main(String[] args) {
        String[] names={"Durga","","Rani",null,"Shivani"};
               Predicate<String> p = s->s!=null&& s.length()!=0;
               ArrayList<String> list = new ArrayList<String>();
               for(String s:names){
                   if(p.test(s)){
                       list.add(s);
                   }
                   
               }
               System.out.println(list);
    }
      
}
