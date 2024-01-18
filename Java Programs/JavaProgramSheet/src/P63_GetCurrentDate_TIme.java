import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class P63_GetCurrentDate_TIme {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
	}
}
