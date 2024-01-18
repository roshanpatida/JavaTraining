import java.util.Arrays;

public class P121_Checkiftwostringsare_anagram {
public static void main(String[] args) {
	String str1 = "Race";
	String str2 = "Care";
	if(str1.length()== str2.length()) {
	 str1 = str1.toLowerCase();
	str2 =  str2.toLowerCase();
	
 char [] arr1 = str1.toCharArray();
 char[] arr2 = str2.toCharArray();
 
 Arrays.sort(arr1);
 Arrays.sort(arr2);
 
 boolean result = Arrays.equals(arr1, arr2);
 if(result) {
	 System.out.println("Anagram String");
 }
 else{
	System.out.println("not anagram"); 
 }}else {
	 System.out.println("Not anagram");
 }
 
}
}
