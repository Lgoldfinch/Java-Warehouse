package game;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class TestGame {
	
	int acutalNum = 23;
	//Random rand = new Random(); 
	int startNumber = 10;//= rand.nextInt(50);
	int largeStartNumber = 20;
	char currentInput = 'L'; 
	 
	Game game = new Game();
	
	@Test
	public void existanceCheck() {
		assertNotNull(game);
	}
	
	@Test
	public void largeStepUpTest() {
		assertEquals("Game does not add", 30, game.stepHigher(10));
	}
	
	@Test
	public void largeStepDownTest() {
		assertEquals("Game does not subtract", 10, game.stepLower(10));
	}
	
	@Test
	public void smallStepUpTest() {
		assertEquals("Game does not add", 21, game.stepHigher(1));
	}
	
	@Test
	public void smallStepDownTest() {
		assertEquals("Game does not subtract", 19, game.stepLower(1));
	}
	
	@Test 
	public void guessTest() {
		assertEquals("Number is not correct", -1, game.guess(currentInput));
	}
	
	
}
