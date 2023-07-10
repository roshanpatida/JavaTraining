/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section10;

/**
 *
 * @author roshan_patidar
 */
public class OverLoading {
    int  overload(int n , int m){
       return n + m;
    }
    int overload(int n , int b, int c){
        return n+b+c;
    }
    public static void main(String[] args) {
        OverLoading or = new OverLoading();
        int x =or.overload(4,5);
        int y = or.overload(4,5,6);
        System.out.println(x);
        System.out.println(y);
    }
   

    
    }

