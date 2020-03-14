import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMySlots {

	@Test
	void fiveElementsInArrayTest() {
		BetterSlot s = new BetterSlot();

		int array[] = s.pullTheLever();
		assertEquals(5, array.length);
	}
	
	/*@Test elementsInTheValidRangeTest() {
		SlipperySlot s = new SlipperySlot();
		
		int array[] = s.pullTheLever();
	}*/
	
	@Test
	void fiveMatchTest() {
		BetterSlot s = new BetterSlot();
		int array[] = new int[] {5, 5, 5, 5, 5};
		
		assertEquals(1000000, s.payOff(array));
		
		//fail("Not yet implemented");
	}

	@Test
	void fourMatchTest() {
		BetterSlot s = new BetterSlot();
		int array[] = new int[] {5, 7, 5, 5, 5};
		
		assertEquals(10000, s.payOff(array));
	}
	
	@Test
	void threeAndTwoMatchTest() {
		BetterSlot s = new BetterSlot();
		int array[] = new int[] {5, 3, 5, 3, 5};
		
		assertEquals(5000, s.payOff(array));
	}
	
	@Test
	void onlyThreeMatchTest() {
		BetterSlot s = new BetterSlot();
		int array[] = new int[] {5, 3, 5, 5, 10};
	
		assertEquals(100, s.payOff(array));
	}
	
	@Test
	void onlyTwoMatchTest() {
		BetterSlot s = new BetterSlot();
		int array[] = new int[] {5, 7, 3, 5, 10};
	
		assertEquals(10, s.payOff(array));
	}
	
	@Test
	void One42Test() {
		BetterSlot s = new BetterSlot();
		int array[] = new int[] {5, 7, 3, 42, 10};
	
		assertEquals(2, s.payOff(array));
	}
	
	@Test 
	void One42AndTwoMatching() {
		BetterSlot s = new BetterSlot();
		int array[] = new int[] {5, 7, 5, 42, 10};
	
		assertEquals(12, s.payOff(array));
	}
	
	@Test
	void two42Test() {
		BetterSlot s = new BetterSlot();
		int array[] = new int[] {5, 42, 3, 42, 10};
	
		assertEquals(12, s.payOff(array));
	}
	
	@Test
	void three42Test() {
		BetterSlot s = new BetterSlot();
		int array[] = new int[] {5, 42, 3, 42, 42};
	
		assertEquals(102, s.payOff(array));
	}

}
