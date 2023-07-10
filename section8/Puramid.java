/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section8;

/**
 *
 * @author roshan_patidar
 */
public class Puramid {
    public static void main(String[] args) {
       
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<2*n-1;j++){
                if(j >= n-(i-1) && j <= n+(i-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    
}



    



