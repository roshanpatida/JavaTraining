package com.junit;

public class MyMath {
 public int calculateSum(int[] numbers)
 {
	 
	 // for  example -  {1,2,4} = [1+2+4] = [7] is the final answer 
	 int sum = 0;
	 for(int number:numbers) {
		 sum += number;
	 }
	 return sum;
 }
}
