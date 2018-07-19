package connect4;

public class Player {

/////////////////////////////////Attributes/////////////////////
	
	private Chip playerColour;
	private int winStreak;
	private String name;
	private int successRate;
	private boolean turn;
///////////////////////////////Constructors/////////////////////////////
	public Player(Chip gameChip) {
		this.playerColour = gameChip;
		if(this.playerColour.getColour()=="Yellow")
		{
			this.turn = true;
		}
		else
		{
			this.turn = false;
		}
	}
	
	

//////////////////////////////Methods////////////////////////////////
	public Chip getChip() {
		return playerColour;
	}
	public void setChip(Chip playerColour) {
		this.playerColour = playerColour;
	}
	
}
