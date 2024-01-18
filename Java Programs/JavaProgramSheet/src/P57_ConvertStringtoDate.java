import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class P57_ConvertStringtoDate {
	public static void main(String[] args) {

		String s = "2023-01-23";
		LocalDate date = LocalDate.parse(s, DateTimeFormatter.ISO_DATE);
		System.out.println(date);
	}
}