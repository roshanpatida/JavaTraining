/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section24_generics.com;

/**
 *
 * @author roshan_patidar
 * @param <T>
 */
public class Problem1<T> {
    T data[] = (T[])new Object[3];
    public static void main(String[] args) {
        Problem1<Integer> s= new Problem1<>();
//        s.data[0]="hi";  // it will throw error because i assign integer
                                 // // i passed string so it is not work
                                 // // and it define at compile time through the help of generics
                                 // //but without generic it will compile perfectly and throw error at runtime 
                                 // // which is not perfect for project
//        s.data[1]="hello";
        s.data[0]=10;
         s.data[1]=10;
          s.data[2]=10;
          
                System.out.println(s);
    }
            
}
