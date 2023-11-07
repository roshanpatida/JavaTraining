package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	@Test
	void test() {
		int numbers[] = {1,2,3};
		MyMath math = new MyMath();
	int result = math.calculateSum(numbers);
	System.out.println(result);
	
	// it is use to chack the unit test for expected result which is provided by the developer already
	int expectedResult = 6;
	assertEquals(expectedResult, result);
		// its successful testing 
	// now our git us successfully commited
	// this is folder changing
	}

}
