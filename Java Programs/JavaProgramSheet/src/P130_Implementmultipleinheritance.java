interface intref1{
	 public int sum(int a, int b) ;
}
interface interef2{
	public int substract(int a , int b);
}
public class P130_Implementmultipleinheritance implements intref1,interef2{

	@Override
	public int substract(int a,int b) {
		int substracts = a - b;
		return substracts;
	}

	@Override
	public int sum(int a, int b) {
		int sums = a + b;
		return sums;
	}
   public static void main(String[] args) {
	   P130_Implementmultipleinheritance s = new P130_Implementmultipleinheritance();
	   System.out.println(s.sum(3, 5));
	   System.out.println(s.substract(5, 2));
}
	
	

}
