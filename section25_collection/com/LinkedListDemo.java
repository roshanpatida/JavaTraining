/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25_collection.com;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author roshan_patidar
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        
    
     LinkedList<Integer>  al1= new LinkedList<>(List.of(10,20,30,40));
 LinkedList<Integer> al2= new LinkedList<>(List.of(10,20,30,40)); 
 System.out.print("hhfsj");
     System.out.println(al1.equals(al2));
//    al1.add(Integer.SIZE);
//    System.out.print("add element");
//    System.out.println(al1);
//    
//    al1.add(0, Integer.SIZE);
//    System.out.print("add element on mention index");
//    System.out.println(al1);
    al1.addAll(al2);
//    System.out.print("add all elements of existing list in new list");
//    System.out.println(al1);
//    al1.addAll(0, al2);
//    System.out.print("add elements from mentions indexing ");
//    System.out.println(al1);
    al1.addFirst(20);
    System.out.print("add at first index");
    System.out.println(al1);
    al1.addLast(55);
    System.out.print("add at the last index");
    System.out.println(al1);
//    al1.clear();
//    al2.clone();
     System.out.print("hhfsj");
     System.out.println(al1.equals(al2));
    System.out.print("its print the exact copy of the list");
    System.out.println(al1);
    
  
//    al1.containsAll(al2);
//    System.out.println(al1);
    al1.descendingIterator();
    System.out.print("hello ");
    System.out.println(al1);
    al1.element();
    System.out.print(" print the available elements");
    System.out.println(al1);
//    al1.equals(10);
    System.out.print("helo");
    System.out.println(al1.equals(al2));
//    al1.forEach(action);
//System.out.println(al1);
    al1.get(0);System.out.println(al1);
    
    
//        System.out.println("jjj");
//    System.out.println(al1.getClass());
   
    System.out.println( al1.getFirst());
  
    System.out.println(  al1.getLast());
    
        System.out.print(" janarate hashcode");
    System.out.println(al1.hashCode());
    
    
    System.out.println("index of "+ al1.indexOf(30));
    
        System.out.println("isEmpty return boolean value "+ al1.isEmpty());
        al1.iterator();
        System.out.println("iterator");
        System.out.println(al1);
    System.out.println(" iterator"+al1.iterator());
    
    System.out.println(al1);
    al1.lastIndexOf(al2);
    System.out.println(al1);
    al1.listIterator();
    System.out.println(al1);
//    al1.notify();
System.out.println(al1);
//    al1.notifyAll();

    al1.offer(Integer.SIZE);
    System.out.println(al1);
    al1.offerFirst(Integer.SIZE);
    System.out.println(al1);
    al1.offerLast(Integer.SIZE);
    System.out.println(al1);
    al1.parallelStream();
    System.out.println(al1);
    al1.peek();
    System.out.println(al1);
    al1.peekFirst();
    System.out.println(al1);
    
    al1.peekLast();
    System.out.println(al1);
    al1.poll();
    System.out.println(al1);
    al1.pollFirst();
    System.out.println(al1);
    al1.pollLast();
    System.out.println(al1);
    al1.pop();
    System.out.println(al1);
    al1.push(Integer.SIZE);
    System.out.println(al1);
    al1.remove();
    System.out.println(al1);
    al1.remove(al2);
    System.out.println(al1);
    al1.remove(0);
    System.out.println(al1);
    al1.removeAll(al2);
    System.out.println(al1);
    al1.addAll(al2);
    System.out.println(al1);
    
    
    al1.removeFirst();
    System.out.println(al1);
    al1.removeFirstOccurrence(al2);
    System.out.println(al1);
    al1.removeLast();
    System.out.println(al1);
    al1.removeFirstOccurrence(al2);
    System.out.println(al1);
//    al1.replaceAll(operator);
    al1.retainAll(al2);
    System.out.println(al1);
    al1.set(0, Integer.SIZE);
    System.out.println(al1);
    al1.size();
    System.out.println(al1);
//    al1.sort();
System.out.println(al1);
     al1.spliterator();
     System.out.println(al1);
     al1.stream();
     System.out.println(al1);
     al1.subList(0, 0);
    System.out.println(al1);
//     al1.toArray();

//     al1.toArray(generator);
//     al1.toArray(args);
//     al1.toString();
//     al1.toString();
//     al1.wait();
//     al1.wait(10);
//al1.wait(0, 0);

    }
 
}
