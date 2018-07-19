package rockPaperScissors;

import java.util.Random;

public class MakeGame {

	Random randy = new Random(); 
	
	public String userMove(String choice) {
		
		if(choice == "Rock") {
		     return " Rock";
		}
		if (choice == "Paper") {
	       	return "Paper";
		}
		if(choice == "Scissors") {
		   return "Scissors";
		}else {
			return "User has crumbled"; 
		} 
    }
	
	public String computerMove (int randChoice) {
		
		int rps = randChoice;
		String output = null;
		
		switch (rps) {
		case(0): output = "Rock";
		      break;
		case(1) : output = "Paper";
		        break;
		case(2): output= "Scissors";
		        break;
	}
		return output;	
	} 
	
	public String matchOutcome (String results) {
		if (userMove ==  
		return results; 
	}
}
		
