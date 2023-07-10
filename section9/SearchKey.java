/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section9;
import java.util.*;
/**
 *
 * @author roshan_patidar
 */
public class SearchKey {
    public static void main(String[] args){
    int A[]={3,9,7,8,12,6,15,5,4,10};
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Key " );
        int key=sc.nextInt();
        
        
        for(int i=0;i<A.length;i++)
        {
            if(key==A[i])
            {
                System.out.println("Element Found at :"+i);
                System.exit(0);
            }
        }
        System.out.println("Not found");
    
        
    }
}
