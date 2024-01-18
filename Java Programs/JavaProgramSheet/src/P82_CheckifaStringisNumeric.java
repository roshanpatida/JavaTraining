
public class P82_CheckifaStringisNumeric {
	public static void main(String[] args) {
		String s = "234234";
		boolean numeric = false;
		try {
			int number = Integer.parseInt(s);

		} catch (Exception e) {
			numeric = true;
		}

		if (numeric == false) {
			System.out.print("String is numeric");
		} else {
			System.out.println("String is not numeric");
		}

	}
}
