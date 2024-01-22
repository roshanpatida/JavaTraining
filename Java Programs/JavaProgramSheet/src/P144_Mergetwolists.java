

import java.util.ArrayList;
import java.util.List;

class P144_Mergetwolists {
  public static void main(String[] args) {

    List<Integer> prime = new ArrayList<>();
    prime.add(2);
    prime.add(3);
    prime.add(5);
    System.out.println("First List: " + prime);

    
    List<Integer> even = new ArrayList<>();
    even.add(4);
    even.add(6);
    System.out.println("Second List: " + even);

    List<Integer> numbers = new ArrayList<>();
    numbers.addAll(prime);
    numbers.addAll(even);

    System.out.println("Merged List: " + numbers);

  }
}