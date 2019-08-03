package _01_Searching_Algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import _02_More_Algorithms.Algorithms;
import static org.junit.Assert.*; 
class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] eggs = new String[] { "whole", "whole", "whole", "whole", "cracked", "whole", "whole", "whole",
				"whole", "whole", "whole", "whole" };
		assertEquals(4, _00_LinearSearch.linearSearch(eggs, "cracked"));
		String[] widest = new String[] {"bob", "michael", "sam" };
		assertEquals(1, _00_LinearSearch.linearSearch(widest, "michael"));
		assertEquals(0,_00_LinearSearch.linearSearch(widest, "bob"));
		assertEquals(2,_00_LinearSearch.linearSearch(widest, "sam"));
		
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] arraynum = new int[] {1, 2, 3, 4, 5, 6 , 7 , 8};
		assertEquals(4,_01_BinarySearch.binarySearch(arraynum, 1, 8, 5));
		assertEquals(1,_01_BinarySearch.binarySearch(arraynum, 1, 8, 2));
		assertEquals(5, _01_BinarySearch.binarySearch(arraynum, 1, 8, 6));
		assertEquals(7,_01_BinarySearch.binarySearch(arraynum, 1, 8, 8));
		
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] arraynum = new int[] {1, 2, 3, 4, 5, 6 , 7 , 8};
		assertEquals(4,_01_BinarySearch.binarySearch(arraynum, 1, 8, 5));
		assertEquals(1,_01_BinarySearch.binarySearch(arraynum, 1, 8, 2));
		assertEquals(5, _01_BinarySearch.binarySearch(arraynum, 1, 8, 6));
		assertEquals(7,_01_BinarySearch.binarySearch(arraynum, 1, 8, 8));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] arraynum = new int[] {1, 2, 3, 4, 5, 6 , 7 , 8};
		assertEquals(4,_01_BinarySearch.binarySearch(arraynum, 1, 8, 5));
		assertEquals(1,_01_BinarySearch.binarySearch(arraynum, 1, 8, 2));
		assertEquals(5, _01_BinarySearch.binarySearch(arraynum, 1, 8, 6));
		assertEquals(7,_01_BinarySearch.binarySearch(arraynum, 1, 8, 8));
	}
}
