/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section10;

/**
 *
 * @author roshan_patidar
 */
public class Lcm {
    int gcd(int n, int m){
        while(m!=n){
            if(m>n)m=m-n;
            else n=n-m;
        }
        return m;
    }
    public static void main(String[] args) {
        Lcm sc = new Lcm();
        System.out.println(sc.gcd(35,56));
    }
}
