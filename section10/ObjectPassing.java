/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section10;

/**
 *
 * @author roshan_patidar
 */
public class ObjectPassing {
       static void change(int A[],int index,int value)
    {
        A[index]=value;
    }
    
    static void change2(int x,int value)
    {
        x=value;
    }
    
    public static void main(String[] args) {
        int A[]={2,4,6,8,10};
        
        change(A,2,20);
        
        for(int x:A)
        {
            System.out.println(x);
        }
        
        int x=10;
        
        change2(x,20);
        
        System.out.println("Value of primitive"+x);
    }

        
    }

