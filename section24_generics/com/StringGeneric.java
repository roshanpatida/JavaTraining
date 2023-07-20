/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section24_generics.com;

/**
 *
 * @author roshan_patidar
 */
class Data2<T>{
    T A[]=(T[])new Object[10];
    int length=0;
    public void append(T v){
    A[length++] =v;
    }
    public void display(){
        for(int i=0;i<length;i++){
            System.out.println(A[i]);
        }
    }
    
}
public class StringGeneric {
    public static void main(String[] args) {
        Data2<String> s=new Data2<>();
        s.append("Roshan");
        s.append("Harshit");
        s.append("Abhigyan");
        s.append("Jigyasha");
        s.append("Sarika");
        s.display();
    }
}
