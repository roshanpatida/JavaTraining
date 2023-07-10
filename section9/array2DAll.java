/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section9;

/**
 *
 * @author roshan_patidar
 */
public class array2DAll {
    public static void main(String[] args) 
    {
        
        int A[][]=new int[5][5]; // creating array
        
        
        int B[][]; //creating 2d array
        B=new int[5][5];
        
        int [][]C=new int[5][5];
        int []D[]=new int[5][5];
        
        //E is a 2D array and F is a 1D array
        int[] E[],F;
        E=new int[5][5];
        F=new int[5];
        
       
        int[] G,H,I;
        
        
       
        int M[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        
       //Jagged Array
        int X[][];
        X=new int[3][];
        
        X[0]=new int[5];
        X[1]=new int[3];
        X[2]=new int[8];
        
        
        
        for(int x[]:M)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
        
    }
    
}

