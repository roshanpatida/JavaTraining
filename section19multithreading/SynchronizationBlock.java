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
class MyData{
   synchronized public void display(String str){
  
    for(int i =0;i<str.length();i++){
        System.out.print(str.charAt(i));
    }
    }
}

class MyThread22 extends Thread{
MyData d;
MyThread22(MyData dat){
d = dat;
}
public void run(){
d.display("Hello World");


}
}
class MyThread23 extends Thread{
MyData data;
MyThread23(MyData dat){
data = dat;
}
public void run(){
data.display("Welcome");

}
}
public class SynchronizationBlock {
    public static void main(String[] args) {
        
    
    MyData d = new MyData();
    MyThread22 t1 = new MyThread22(d);
    MyThread23 t2 = new MyThread23(d);
    t1.start();
    t2.start();
       
}
}