package barrenMoorTest;

import static org.junit.Assert.*;

import org.junit.Test;

import barrenMoor.BarrenMoorGame;
import barrenMoor.BarrenMoorGame2;

public class BarrenMoorGameTest {

	
	
	//	public void testStartMethod() {
	//		BarrenMoorGame bmg = new BarrenMoorGame();
//	@Test
////	public void testStartBarrenMoor() {
////		BarrenMoorGame bmg = new BarrenMoorGame("start");
////		assertNotNull(bmg);
////	public void testPlayerHasMadeAMove() { 
////		BarrenMoorGame bmg = new BarrenMoorGame();
////		assertEquals("Person has not made a move", bmg.getMove(),"North");
//	}
//		}
	//"Player does not start",bmg.startBarrenMoorGame(), "bosh");
	@Test 
	public void testStartGame() {
		BarrenMoorGame2 bmg2 = new BarrenMoorGame2();
		assertEquals("Player has not been able to start the game",bmg2.startBMG2("start"), "start");
	}
	}

	

