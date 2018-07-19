package dogPlacementTest;

import static org.junit.Assert.assertEquals;

import dogPlacement.DogPlacement;

public class DogPlacementTest {
	
	@org.junit.Test
	public void testFillList() {
		DogPlacement test = new DogPlacement();
		test.fillList();
		assertEquals("dog not placed", test.removeDog(4), "4th");
	}
	
	@org.junit.Test
	public String testResult() {
		DogPlacement test = new DogPlacement();
		test.fillList();
		assertEquals("Problem", test.result(4), null);
	}
	
}
