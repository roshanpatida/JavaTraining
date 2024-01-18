
public class P94_convertdoubletypevariablestostring {
public static void main(String[] args) {
	double d = 233.32;
	String s= String.valueOf(d);
	System.out.println(s);
	String s1 = ((Object)s).getClass().getSimpleName();
	System.out.println(s1);
}
}
