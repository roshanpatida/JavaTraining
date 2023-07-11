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

class UsingRunnableInterfaceSingleClass implements Runnable {
public void run(){
    int i=1;
    while(true){
        System.out.println(i+"Hello");
        i++;
    }
}
    public static void main(String[] args) {
        UsingRunnableInterfaceSingleClass st1 = new UsingRunnableInterfaceSingleClass();
        Thread st= new Thread();
        st.start();
        int i = 1;
        while(true){
            System.out.println(i +" World");
            i++;
        }
        
    }
}
