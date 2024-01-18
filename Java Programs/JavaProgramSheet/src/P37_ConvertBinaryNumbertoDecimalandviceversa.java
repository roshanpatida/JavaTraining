import java.lang.Math;
public class P37_ConvertBinaryNumbertoDecimalandviceversa {
	
	public static  int binary(int binary) {
	
		int n=0;
		int decimal = 0;
	  
	   while(binary>0)
	   
	   if(binary==0){break;}
	   else{
		   int num = binary%10;
		   decimal  += num*Math.pow(2, n);
		   binary = binary/10;
		   n++;	
	   }
	   
	   return decimal;
	}
	   
	public static void main(String[] args) {  
		System.out.println(binary(1010));
	}
}
