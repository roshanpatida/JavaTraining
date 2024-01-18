
public class P124_CleartheStringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append("hy");
		sb.append("hii");
		System.out.println("original : "+sb);
		sb.delete(0, sb.length());
		System.out.println("updated : " + sb);
	}
}
