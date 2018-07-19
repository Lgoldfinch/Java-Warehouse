package rockPaperScissors;

import static org.junit.Assert.*;

import org.junit.Test;

public class MakeGameTest {
    
	@Test
	public void userTurn() {
		MakeGame testGame = new MakeGame();
		assertEquals("Not RPS","Paper",testGame.userMove("Paper"));
	}
	@Test
	public void comTurn() {
		MakeGame randGame = new MakeGame();
		assertEquals("Not Random","Rock", randGame.computerMove("output"));
	}
}
