
public class FindtheLargestAmongThreenumbers {

	public static void main(String[] args) {
		int n1 = 13, n2 = 42, n3 = 2;

		if (n1 >= n2 && n1 >= n3) {
			System.out.println(n1 + "is largest");
		}
		if (n2 >= n1 && n2 >= n3) {
			System.out.println(n2 + "largest");
		} else {
			System.out.println(n3 + "largest");
		}

	}
}
