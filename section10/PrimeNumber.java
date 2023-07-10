/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section10;

/**
 *
 * @author roshan_patidar
 */
public class PrimeNumber {
    static boolean isPrime(int n){
        for(int i = 2;i<=n/2;i++){
            if(n%i==0)
            return false;
                
    }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(""+ isPrime(10));
        
    }
}
