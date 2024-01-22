
public class P64_ConvertMillisecondstoMinutesandSeconds {
																																																																																																																				
	public static void main(String[] args) {
		long miliseconds = 350000;
		long minute = (miliseconds /1000) /60;
		long second = (miliseconds/1000) %60;
		
		System.out.println(minute);
		System.out.println(second);
	}
}
