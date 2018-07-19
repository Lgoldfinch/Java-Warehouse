package connect4test;

import static org.junit.Assert.*;

import org.junit.Test;

import connect4.Chip;
import connect4.Player;

public class PlayerTest {

	@Test
   public void testPlayerMaker() {
	   Player p = new Player(new Chip(1));
	   assertNotNull(p); 
	}
	@Test
	public void testPlayerisNo1() {
		Player p = new Player(new Chip(1));
		assertEquals("Player is not Yellow",p.getChip().getColour(),"Yellow");
		}
	@Test
	public void testPlayerisNo2() {
		Player p = new Player(new Chip(2));
		assertEquals("Player is not Yellow",p.getChip().getColour(),"Red");
	}
	@Test
		public void testPlayerisNo3() {
			Player p = new Player(new Chip(100));
			assertEquals("Player is not Yellow",p.getChip().getColour(),"Black");
	}
	@Test 
	    public void testSetChip() {
		Player p = new Player(new Chip(5));
		p.setChip(new Chip(2));
		assertEquals("Player is not yellow",p.getChip().getColour(),"Red");
	}
}

