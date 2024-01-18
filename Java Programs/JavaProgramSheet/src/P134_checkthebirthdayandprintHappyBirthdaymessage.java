import java.time.LocalDate;
import java.time.Month;

public class P134_checkthebirthdayandprintHappyBirthdaymessage {
	public static void main(String[] args) {
		
		int birthdate = 18;
		Month birthMonth = Month.JANUARY;
		
	LocalDate  todaydate = LocalDate.now();
   Month month = todaydate.getMonth();
   int date = todaydate.getDayOfMonth();
   if(birthdate == date && birthMonth == month ) {
		System.out.println("happy birthday to you");
	}
   else {
	   System.out.println("sorry ");
   }
   
}}
