import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class P66_JoinTwoLists {
public static void main(String[] args) {
	List<Integer> s1 = new ArrayList<Integer>();
	s1.add(1);
	s1.add(24);
	List<Integer> s2 = new ArrayList<Integer>();
	s2.add(32);
	s2.add(43);
	
	List<Integer> finalList = new ArrayList<Integer>();
	finalList.addAll(s1);
	finalList.addAll(s2);
	
	System.out.println(finalList);
}
}
