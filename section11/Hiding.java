/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section11;

/**
 *
 * @author roshan_patidar
 */
class MethodHiding {
    private int s;
    private int y;
    
    public int getS(){
        return s;
    } 
    public int getY(){
        return y;
    }
     public void setS(int a){
         if(a>=0) s=a;
         else s=0;
     }
     public void setY(int b){
         if(b>=0) s =b;
         else s=0;
     }
     public int result(){
         return getS()*getY();
     }
     public int plush(){
         return getS() + getY();
     }}
     public class Hiding{
         public static void main(String[] args) {
             MethodHiding sc = new MethodHiding();
             sc.setS(5);
             sc.setY(7);
             System.out.println("Multiplication" + sc.result());
             System.out.println("Plus" + sc.plush());
         }
     
             
             
     
    
}
