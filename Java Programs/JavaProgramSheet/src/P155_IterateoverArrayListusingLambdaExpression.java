import java.util.ArrayList;

public class P155_IterateoverArrayListusingLambdaExpression {
public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<String>();
	list.add("hello");
	list.add("hyy");
	list.add("hii");
	list.add("no");
	
	
	list.forEach((e)->{
		System.out.print(e + ",");
	});
}
}
