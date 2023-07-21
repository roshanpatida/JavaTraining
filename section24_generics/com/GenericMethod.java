/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section24_generics.com;

/**
 *
 * @author roshan_patidar
 */
public class GenericMethod {
static <E> void show(E... list){ // <E> is a generic method 
for(E x: list){
    System.out.println(x);}}
    public static void main(String[] args) {
        show(new String[]{"hi","roshan","harshit"});
        show(new Integer[]{10,12,12,12,23});
        show(10,12,12,12,23);
        
    }
        
}
