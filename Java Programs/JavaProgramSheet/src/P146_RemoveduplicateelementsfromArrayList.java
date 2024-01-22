

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

class P146_RemoveduplicateelementsfromArrayList {
  public static void main(String[] args) {

   
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1, 3));
    System.out.println("ArrayList with duplicate elements: " + numbers);

    Set<Integer> set = new LinkedHashSet<>();
    set.addAll(numbers);

    numbers.clear();

    numbers.addAll(set);
    System.out.println("ArrayList without duplicate elements: " + numbers);
  }
}