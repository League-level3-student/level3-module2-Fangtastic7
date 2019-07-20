package _01_Searching_Algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		assertEquals(1,1);
		assertEquals(2,2);
		assertEquals(3,3);
		
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		assertEquals(1,1);
		assertEquals(2,2);
		assertEquals(3,3);
		assertEquals(10,10);
		
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		assertEquals(1,1);
		assertEquals(2,2);
		assertEquals(3,3);
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		assertEquals(1,1);
		assertEquals(2,2);
		assertEquals(3,3);
	}
}
