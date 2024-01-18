
public class FindallRootsofaQuadraticEquation {
	public static void main(String[] args) {

		int n = 401;
		if (n % 4 == 0) {
			if (n % 100 == 0) {
				if (n % 400 == 0) {
					System.out.println("lean year");
				} else {
					System.out.println("not leap year");
				}

			} else {
				System.out.println("leap year");
			}

		} else {
			System.out.println("not lear year");
		}

	}
}
