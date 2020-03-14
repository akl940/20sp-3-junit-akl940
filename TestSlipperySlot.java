import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSlipperySlot {

	@Test
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
	void fiveMatchTest() {
		SlipperySlot s = new SlipperySlot();
		int array[] = new int[] {5, 5, 5, 5, 5};
		
		assertEquals(1000000, s.payOff(array));
		
		//fail("Not yet implemented");
	}

	@Test
	void fourMatchTest() {
		SlipperySlot s = new SlipperySlot();
		int array[] = new int[] {5, 7, 5, 5, 5};
		
		assertEquals(10000, s.payOff(array));
	}
	
	@Test
	void threeAndTwoMatchTest() {
		SlipperySlot s = new SlipperySlot();
		int array[] = new int[] {5, 3, 5, 3, 5};
		
		assertEquals(5000, s.payOff(array));
	}
	
	@Test
	void onlyThreeMatchTest() {
		SlipperySlot s = new SlipperySlot();
		int array[] = new int[] {5, 1, 5, 5, 10};
	
		assertEquals(100, s.payOff(array));
	}
	
	@Test
	void onlyTwoMatchTest() {
		SlipperySlot s = new SlipperySlot();
		int array[] = new int[] {5, 1, 3, 5, 10};
	
		assertEquals(10, s.payOff(array));
	}
}
