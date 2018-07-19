package connect4test;

import static org.junit.Assert.*;

import org.junit.Test;

import connect4.Chip;

public class ChipTest {
	@Test
	public void testMakingChip() {
		Chip c = new Chip(1);
		assertNotNull(c);
	}
	@Test
	public void testChipIsMadeYellow() {
		Chip c = new Chip(1);
		assertEquals("Chip was Red",c.getColour(),"Yellow");
	}
	@Test
	public void testChipIsMadeRed() {
		Chip c = new Chip(2);
		assertEquals("Chip was Yellow",c.getColour(),"Red");
	}
	@Test
	public void testChipIsMadeBlack() {
		Chip c = new Chip(100);
		assertEquals("Chip was Red",c.getColour(),"Black");
	}
}
