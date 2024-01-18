
public class P41_calculatethepowerusingrecursion {

	public static int power(int number, int pow) {
		if (pow != 0) {
			return (number * power(number, pow - 1));
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		System.out.println(power(3, 2));
	}
}
