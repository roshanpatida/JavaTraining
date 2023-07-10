/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section11;

/**
 *
 * @author roshan_patidar
 */
public class Constructor {
  
        
    
Constructor(){
    System.out.println("first constructor");
}    
Constructor(int a){
        this();
    System.out.println("Second" + a);
}
Constructor(int a,int b){
        this(10);
    System.out.println("third" + a+b);
}
  public static void main(String[] args) {
Constructor sc= new Constructor(10,20);
  }
}