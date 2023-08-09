package section2lambdaexpressionwithcollection;
import java.util.Comparator;
import java.util.TreeSet;
 class MyComparator implements Comparator<Integer>
 {
 @Override
 public int compare(Integer I1,Integer I2)
 {
     
     return (I1>I2)?-1:(I1<I2)?1:0;
     
 }
 }
 class ComparatorInSortForm 
 {
 public static void main(String[] args)
 {
 TreeSet<Integer> l = new TreeSet<Integer>(new MyComparator());
 l.add(10);
 l.add(0);
 l.add(15);
 l.add(5);
 l.add(20);
 System.out.println(l);
 }
 } 