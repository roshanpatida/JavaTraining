
public class P22_ReverseaNumber {
	public static void main(String[] args) {
		int n = 233, rem, sum = 0;
		while (n > 0) {
			rem = n % 10;
			sum = (sum * 10) + rem;
			n = n / 10;
		}

		System.out.println(sum);
	}
}
