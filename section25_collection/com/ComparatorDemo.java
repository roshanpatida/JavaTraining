/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25_collection.com;
import java.util.*;
/**
 *
 * @author roshan_patidar
 */


class My implements Comparator<Integer>
{
    public int compare(Integer i1,Integer i2)
    {
        if(i1<i2)
            return 1;
        if(i1>i2)
            return -1; // its make low priority low value
                        // high priority high value
                        // apposite of priorityqueue
        return 0;
    }
}

public class ComparatorDemo 
{
    public static void main(String[] args) 
    {
        Integer a[]={2,4,6,8,1,3,5,7};
        
        
        Arrays.sort(a);
        
       for(Integer x:a) 
            System.out.println(x);

    }   
}