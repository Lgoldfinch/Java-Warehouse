package rockPaperScissors;

import java.util.Random;

public class mainRPS {

	public static void main(String[] args) {
		
		MakeGame mg = new MakeGame();
		
		 Random randy = new Random(); 
		 
		 mg.computerMove(randy.nextInt(3));
		
		 //System.out.println("Player picks: " + mg.userMove("Rock"));
		 System.out.println("Computer picks: " + mg.computerMove(randy.nextInt(3)));
		 
		 
	}

}
