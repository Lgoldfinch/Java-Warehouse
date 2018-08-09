package moveTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import move.Team;

public class TeamTest {

	Team t = new Team();
	@Test
	public void testGetTeamID() {
		assertEquals("Team ID not found",t.getTeamID(),"Team???");
	}
	@Test
	public void testSetTeamID() { //Dont know if you need a setter for this.
		t.getTeamID();
		assertEquals("?",t.setTeamID(2),2);
	}
}
