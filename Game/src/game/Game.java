package game;

import java.util.Random;

public class Game {
	
	private char lastInput;
	private int currentGuess;
	private int lastGuess = 0;
	private int stepSize = 10;
	
	public Game() {
		//Random rand = new Random();
		currentGuess = 25;//rand.nextInt(50);
		lastInput = 'H';
	}
	
	
	public int stepHigher(int stepSize) {
		lastGuess = currentGuess;
		return currentGuess += stepSize;
	}
	
	public int stepLower(int stepSize) {
		lastGuess = currentGuess;
		return currentGuess -= stepSize;
	}
	
	public int guess(char currentInput) {
		
		if (currentInput == lastInput) {
			stepSize = 10;
			if (currentInput == 'H')
				stepHigher(stepSize);
			else 
				stepLower(stepSize);
		}
		else {		
			stepSize = 1;
			int range = 10;
			if (currentInput == 'H') {						
				for (int i = currentGuess; i < currentGuess+range; i++)
					stepLower(stepSize);
			}				
			else {
				for (int i = currentGuess; i > currentGuess-range; i--) {					 
					stepHigher(stepSize);
				System.out.println(currentGuess);
				}
			}
		}
		
		
		return currentGuess;
	}

}
