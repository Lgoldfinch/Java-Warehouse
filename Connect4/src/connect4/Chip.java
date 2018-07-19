package connect4;

public class Chip {
	
	/////////////////////////Attributes///////////////////////////////////////////////
	private String colour;
	
	////////////////////////Constructors//////////////////////////////////////////////
	public Chip(int player) {
		if (player == 1) {
		this.colour = "Yellow";
		}
		else if (player == 2) {
			this.colour = "Red"; 
		}
		else {
			this.colour = "Black";
			
		}
	}
	
	
	///////////////////////////Methods////////////////////////////////////////////////
	public String getColour() {
		return this.colour;
	}
	

} 
