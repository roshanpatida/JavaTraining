
public class P42_CalculateAverageUsingArrays {
	public static void main(String[] args) {
		float arr[] = { 1, 4, 5, 2, 7, 3 };
		float sum = 0;
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			sum = sum + arr[i];

		}
		float avg = sum / n;
		System.out.println(avg);
	}

}
