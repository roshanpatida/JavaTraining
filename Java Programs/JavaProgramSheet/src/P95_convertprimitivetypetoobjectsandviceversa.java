
public class P95_convertprimitivetypetoobjectsandviceversa {
	public static void main(String[] args) {
		int n = 3;
		Integer integer = Integer.valueOf(n);
		System.out.println(integer);
		String s = ((Object) integer).getClass().getSimpleName();
		System.out.println(s);

		System.out.println("--------------");
		String s1 = "hello";
		String ss = String.valueOf(s1);
		System.out.println(ss);
		String s2 = ((Object) ss).getClass().getSimpleName();
		System.out.println(s2);
		System.out.println("--------------");
		char ch = 's';
		Character ss1 = Character.valueOf(ch);
		System.out.println(ss1);
		String s3 = ((Object) ss1).getClass().getSimpleName();
		System.out.println(s3);
	}
}
