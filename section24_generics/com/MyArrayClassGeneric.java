/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section24_generics.com;

/**
 *
 * @author roshan_patidar
 */
class Data1<T>{   // just create generic class
    T A[]=(T[])new Object[10]; // convert into object to generics
    //T([]) is type casting  which is used for convert object into generics.
    
    int length=0;
    public void append(T v){ // T is generic data type 
        A[length++]=v;
    }
    public void display(){
        for(int i=0;i<length;i++){
        System.out.println(A[i]);
    }
            
}
}
public class MyArrayClassGeneric {
    public static void main(String[] args){
       Data1<Integer> ma=new Data1<>();  // type casting is use in this line 
       ma.append(10);
       ma.append(11);
       ma.append(12);
       ma.append(10);
       ma.append(11);
       ma.append(12);
        ma.append(10);
        ma.append(11);
        ma.append(12);
        ma.append(10);
       ma.display();
    }
}
