
public class P30_DisplayArmstrongNumberBetweenTwoIntervals {



	public void interval(int a, int b) {

		for (int i = a; i <= b; i++) {

			int n = i, rem = 0, sum = 0;
			int temp = n, count = 0;
			while (temp > 0) {
				temp = temp / 10;
				count++;
			}
			temp = n;
			while (temp > 0) {
				rem = temp % 10;
				sum += power(rem, count);
				temp = temp / 10;

			}
			if (sum == n) {
				System.out.println(sum);
			}

		}

	}
	public static int power(int rem, int count) {
		int num = 1;
		for (int j = 0; j < count; j++) {
			num = num * rem;

		}
		return num;
	}

	public static void main(String[] args) {
		P30_DisplayArmstrongNumberBetweenTwoIntervals s = new P30_DisplayArmstrongNumberBetweenTwoIntervals();
		s.interval(22, 3788);
	}
}
