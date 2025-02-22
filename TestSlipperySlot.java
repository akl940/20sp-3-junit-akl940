import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestSlipperySlot {

	@Test
	@DisplayName("The array has a length of 5")
	void fiveElementsInArrayTest() {
		SlipperySlot s = new SlipperySlot();

		int array[] = s.pullTheLever();
		assertEquals(5, array.length);
	}
	
	/*@Test elementsInTheValidRangeTest() {
		SlipperySlot s = new SlipperySlot();
		
		int array[] = s.pullTheLever();
	}*/
	
	@Test
	@DisplayName("All 5 match")
	void fiveMatchTest() {
		SlipperySlot s = new SlipperySlot();
		int array[] = new int[] {5, 5, 5, 5, 5};
		
		assertEquals(1000000, s.payOff(array));		
	}

	@Test
	@DisplayName("4 match")
	void fourMatchTest() {
		SlipperySlot s = new SlipperySlot();
		int array[] = new int[] {5, 7, 5, 5, 5};
		
		assertEquals(10000, s.payOff(array));
	}
	
	@Test
	@DisplayName("3 and remaining 2 match")
	void threeAndTwoMatchTest() {
		SlipperySlot s = new SlipperySlot();
		int array[] = new int[] {5, 3, 5, 3, 5};
		
		assertEquals(5000, s.payOff(array));
	}
	
	@Test
	@DisplayName("Only 3 match")
	void onlyThreeMatchTest() {
		SlipperySlot s = new SlipperySlot();
		int array[] = new int[] {5, 3, 5, 5, 10};
	
		assertEquals(100, s.payOff(array));
	}
	
	@Test
	@DisplayName("Only 2 match")
	void onlyTwoMatchTest() {
		SlipperySlot s = new SlipperySlot();
		int array[] = new int[] {5, 7, 3, 5, 10};
	
		assertEquals(10, s.payOff(array));
	}
	
	@Test
	@DisplayName("42")
	void One42Test() {
		SlipperySlot s = new SlipperySlot();
		int array[] = new int[] {5, 7, 3, 42, 10};
	
		assertEquals(2, s.payOff(array));
	}
	
	@Test 
	@DisplayName("42; two others match")
	void One42AndTwoMatching() {
		SlipperySlot s = new SlipperySlot();
		int array[] = new int[] {5, 7, 5, 42, 10};
	
		assertEquals(12, s.payOff(array));
	}
	
	@Test
	@DisplayName("Two (matching) 42s")
	void two42Test() {
		SlipperySlot s = new SlipperySlot();
		int array[] = new int[] {5, 42, 3, 42, 10};
	
		assertEquals(12, s.payOff(array));
	}
	
	@Test
	@DisplayName("Three (matching) 42s")
	void three42Test() {
		SlipperySlot s = new SlipperySlot();
		int array[] = new int[] {5, 42, 3, 42, 42};
	
		assertEquals(102, s.payOff(array));
	}
	
	@Test
	@DisplayName("A perfect square")
	void perfSq() {
		SlipperySlot s = new SlipperySlot();
		int array[] = new int[] {5, 7, 3, 9, 11};
	
		assertEquals(7, s.payOff(array));
	}
	
	@Test
	@DisplayName("Two different perfect squares")
	void twoPerfSq() {
		SlipperySlot s = new SlipperySlot();
		int array[] = new int[] {5, 7, 25, 9, 11};
	
		assertEquals(7, s.payOff(array));
	}
	
	@Test
	@DisplayName("Two matching perfect squares")
	void matchPerfSq() {
		SlipperySlot s = new SlipperySlot();
		int array[] = new int[] {5, 7, 9, 9, 11};
	
		assertEquals(17, s.payOff(array));
	}
	
	@Test 
	@DisplayName("A perfect square; two others match")
	void perfSqAndTwoMatching() {
		SlipperySlot s = new SlipperySlot();
		int array[] = new int[] {5, 7, 5, 9, 10};
	
		assertEquals(17, s.payOff(array));
	}
	
	@Test
	@DisplayName("A power of 2")
	void pow2() {
		SlipperySlot s = new SlipperySlot();
		int array[] = new int[] {5, 7, 3, 8, 11};
	
		assertEquals(3, s.payOff(array));
	}
	
	@Test
	@DisplayName("Two different powers of 2")
	void twoPows2() {
		SlipperySlot s = new SlipperySlot();
		int array[] = new int[] {5, 7, 32, 8, 11};
	
		assertEquals(3, s.payOff(array));
	}
	
	@Test
	@DisplayName("Two matching powers of 2")
	void matchPows2() {
		SlipperySlot s = new SlipperySlot();
		int array[] = new int[] {5, 7, 8, 8, 11};
	
		assertEquals(13, s.payOff(array));
	}
	
	@Test 
	@DisplayName("A power of 2; two others match")
	void pow2AndTwoMatching() {
		SlipperySlot s = new SlipperySlot();
		int array[] = new int[] {5, 8, 5, 41, 10};
	
		assertEquals(13, s.payOff(array));
	}
}
