
public class P117_Createanenumclass {
public enum Example{
	BOLD,SMALL,MEDIUM}

public static void main(String[] args) {
	for(Example s : Example.values()) {
		System.out.println(s);
	}
}
}
