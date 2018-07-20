package barrenMoor;

import java.util.Scanner;


///////////////////////////////////////////
public class BarrenMoorGame {

	private String move; 

	Scanner sc = new Scanner(System.in); 
	/////////////////////////////////////////////////////////////


	//////////////////////////////////////////////////////////
	public String startBarrenMoorGame (String start) {
		if (start == "start") {
			sc.next();
			return "You awaken to find yourself in a barren Moor :(. Type 'look' to assess your surroundings";

		}
		if (start == "start") {
			sc.next(); 
			return "Enter 'start' to go on the holiday of your dreams!";
		}
		return null;
	}


	public String playerlook(Boolean ) {
		startBarrenMoorGame ("start");
		sc.next(); 
		if (move == sc.next("look")) { 
			return "Theres a swamp to the north, a cliff to the south, an eerie candlelit path to the east and not much to the West. You have feel a weight in your pocket and discover a magical compass. Ostensibly, this compass is useless. However, upon inspection you notice the compass has a distance funtion on it. The dial reads '100m'. Which direction do you want to go?"; 
		}
		if (move != sc.next("look")) {
			sc.next();
			return "Please look around";
			}
		
public String getMove() {
	return this.move; 
}
			}
		}
////////////////////////////////////////This is rubbish so I started another...//////////////////////////////////////




