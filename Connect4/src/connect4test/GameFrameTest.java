package connect4test;

import static org.junit.Assert.*;

import org.junit.Test;

import connect4.GameFrame;

public class GameFrameTest {
	@Test
	public void testMakingFrame() {
		GameFrame boardTest = new GameFrame(); 
		assertNotNull("Board was Null",boardTest);
	}
	

}
