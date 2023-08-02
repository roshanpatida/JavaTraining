/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25_collection.com;

import java.util.TreeSet;

/**
 *
 * @author roshan_patidar
 */

    


class Point implements Comparable// basacally comaprator gives priority to aposite of comaparable and
        // its bydeafault priority of priorityqueue
{
    int x;// its give priority as per the high priority of high value
    int y;// and low priority of low value 
    public Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString()
    {
        return "x="+x+"y="+y;
    }
    @Override
    public int compareTo(Object o)
    {
        Point p=(Point)o;
        if(this.x<p.x)
            return -1;
        else if(this.x>p.x)
            return 1;
        else
        {
        if(this.y<p.y) 
            return -1;
        else if(this.y>p.y)
            return 1;
        else 
            return 0;
        }
    }
}
// comparable interface is basacally compared two elements of same class of that instance
public class ComparableInterfaceDemo {

    public static void main(String[] args) {
        
        TreeSet<Point> ts=new TreeSet<>();
        
        ts.add(new Point(1,1));
        ts.add(new Point(5,5));
        ts.add(new Point(2,2));
        
        System.out.println(ts);
    }
    
}