/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section24_generics.com;

/**
 *
 * @author roshan_patidar
 */

class Data<T>{
    private T obj;
    public void setData(T v){
        obj=v;
    }
    public T getData(){ //T is generic return type
        return obj; 
    }
}
public class GenericsDemo {
    public static void main(String[] args) {
        Data<Integer> d=new Data<>();
        d.setData(11);// it is also auto boxing part
        d.setData(new Integer(112)); // we cam do also its also form of assign
        // and also it call first
        System.out.println(d.getData());
    }
}
