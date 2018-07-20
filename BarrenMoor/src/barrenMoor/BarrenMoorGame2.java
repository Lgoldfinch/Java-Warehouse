package barrenMoor;

import java.util.Scanner;


public class BarrenMoorGame2 {
Scanner sc = new Scanner(System.in);
public String nextMove; 

public String startBMG2(String start) { 
	if (start == "start") {
		System.out.println("You awaken to find yourself in a barren Moor :(. Type 'look' to assess your surroundings");
		nextMove = sc.next();
		   move1a(nextMove); // I was trying to use the value inputed into the scanner to lead onto the next move but I couldn't work it out. Move1a was my attempt at making the following move. I was looking to create another method, named move1b which would follow the same pattern as 1a but would work with the second if statement in startBMG2.
	        
	}
	if (start != "start") {
		System.out.println("Enter 'start' to go on the holiday of your dreams!");
		nextMove = sc.next();
	}
	return null;
}
public String move1a(String nextMove) {
	startBMG2("start");
	if (this.nextMove == "look") {
		System.out.println("Theres a swamp to the north, a cliff to the south, an eerie candlelit path to the east and not much to the West. You have feel a weight in your pocket and discover a magical compass. Ostensibly, this compass is useless. However, upon inspection you notice the compass has a distance funtion on it. The dial reads '100m'. Which direction do you want to go?");
		this.nextMove = sc.next();
	}
return "he";

	
}
}

// I initially wanted to make a 5x5 matrix and then assign descriptions to each element, but didn't know how to. 

