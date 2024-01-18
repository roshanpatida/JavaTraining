
public class P21_CountNumberofDigitsinanInteger {

	public static void main(String[] args) {
		int n = 13423;
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		System.out.println(count);
	}
}
