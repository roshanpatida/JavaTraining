
public class P55_RemoveAllWhitespacesfromaString {
	public static void main(String[] args) {
		String s = "Roshan Patidar from";
		String word = "", ws = "";
		s = s + " ";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch != ' ') {
				word = word + ch;
			} else {
				ws = ws + word;
				word = "";
			}

		}
		System.out.println(ws);
	}
}
