package section2lambdaexpressionwithcollection;
import java.util.ArrayList;

import java.util.Comparator;
 import java.util.Collections;
 class MyComparator implements Comparator<Integer>
 {
 public int compare(Integer I1,Integer I2)
 {
 return (I1>I2)?-1:(I1<I2)?1:0;
 }
 }
 class ComparatorWithArrayList
 {
 public static void main(String[] args)
{
 ArrayList<Integer> l = new ArrayList<Integer>();
 l.add(10);
 l.add(0);
 l.add(15);
 l.add(5);
 l.add(20);
 System.out.println("Before Sorting:"+l);
 Collections.sort(l,new MyComparator());
 System.out.println("After Sorting:"+l);
 }
 }