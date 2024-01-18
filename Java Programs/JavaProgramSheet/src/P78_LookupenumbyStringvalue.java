
public class P78_LookupenumbyStringvalue {

	public enum Enum {
		BOLD,ITALICS, UNDERLINE, STRIKETHROUGH
	}
	public static void main(String[] args) {
		String s = "bold";
		Enum  enumm = Enum.valueOf(s.toUpperCase());
		System.out.println(enumm);
	}
}
