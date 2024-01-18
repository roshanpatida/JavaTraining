
public class P133_Iterateoverenum {

	public enum Iterate{
		HELLO,HI,YES,NO
	}
	public static void main(String[] args) {
		
	
	for(Iterate i  :Iterate.values()) {
		System.out.print(i + " ");
	}}
}
