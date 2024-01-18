import java.io.PrintWriter;
import java.io.StringWriter;

public class P74_ConvertaStackTracetoaString {
	public static void main(String[] args) {
		try {
			int divide = 0 / 0;
		} catch (ArithmeticException e) {
			StringWriter w = new StringWriter();
			e.printStackTrace(new PrintWriter(w));
			String exception = w.toString();
			System.out.println(exception);
		}
	}
}
