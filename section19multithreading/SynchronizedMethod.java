/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section19multithreading;

/**
 *
 * @author roshan_patidar
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author roshan_patidar
 */
class MyData1{
    public void display(String str){
    synchronized(this)  {
    for(int i =0;i<str.length();i++){
        System.out.print(str.charAt(i));
    }
    }
}
}
class MyThread24 extends Thread{
MyData1 d;
MyThread24(MyData1 dat){
d = dat;
}
public void run(){
d.display("Hello World");


}
}
class MyThread25 extends Thread{
MyData1 data;
MyThread25(MyData1 dat){
data = dat;
}
public void run(){
data.display("Welcome");

}
}
public class SynchronizedMethod {
    public static void main(String[] args) {
        
    
    MyData1 d = new MyData1();
    MyThread24 t1 = new MyThread24(d);
    MyThread25 t2 = new MyThread25(d);
    t1.start();
    t2.start();
       
}
}