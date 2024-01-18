
public class P126_Iteratethrougheachcharactersofthestring {
public static void main(String[] args) {
	String str =  "hello my name is hello";
	for(int i =0;i<str.length();i++) {
		char ch = str.charAt(i);
		System.out.print(ch +" ");
	}
}
}
