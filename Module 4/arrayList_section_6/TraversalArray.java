/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayList_section_6;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author roshan_patidar
 */
public class TraversalArray {
    public static void main(String[] args) {
        ArrayList<String> letter =new ArrayList<String>();
        letter.add("A");
                letter.add("A");
                        letter.add("b");
                                letter.add("c");
                                        letter.add("D");
                                        
                                        for(int i=0;i<letter.size();i++){
                                            String Alpha=letter.get(i);
                                            System.out.println(Alpha);
                                            
                                            // Thruogh the help of iterator mathod
                                            System.out.println("------------------Iterator--------------");
                                            Iterator<String> iterator = letter.iterator();
                                            while(iterator.hasNext()){
                                                String traverse = iterator.next();
                                                System.out.println(traverse);
                                            }
                                        }
                        
        
    }
}
