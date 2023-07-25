/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25_collection.com;

/**
 *
 * @author roshan_patidar
 */

import java.util.*;
// it is use to change the proirty and capmare  different objects of the different classes. 
// comparator interface is use compare method and we override.
// by default the compare method is present in lang package.
// we make the priority of high element of high priority.
class MyCom implements Comparator<Integer>
{
    @Override
    public int compare(Integer o1,Integer o2)
    {
        if(o1<o2)return 1;
        if(o1>o2) return -1;
        return 0;
    }
}

public class PriorityQueueDemo 
{
    public static void main(String[] args) 
    {
        PriorityQueue<Integer> p=new PriorityQueue<>(new MyCom());
        // by default the proirityqueue having the high prority of small elements
        //priorityqueue is work as heap in binary
        // iserting and deleting the elements based on the priority.
        p.add(20);
        p.add(10);
        p.add(30);
        p.add(5);
        p.add(15);
        p.add(3);
        
        System.out.println(p.peek());
        System.out.println(p);
        
        p.forEach((x)->System.out.println(x));
        
        p.poll();
        
        System.out.println("After Deletion");
        p.forEach((x)->System.out.println(x));
        
    }    
}