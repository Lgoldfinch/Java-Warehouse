package moveTest;

import static org.junit.Assert.*;

import org.junit.Test;

import move.AdminUser;
import move.GuestUser;
import move.Team;

public class TeamTest {
    AdminUser au = new AdminUser("longjohn@gmail.com", 0);
    GuestUser gu = new GuestUser("longjohn@gmail.com", 0);
	Team t = new Team(au, gu, 1);
	@Test
	public void testGetTeamID() {
		assertEquals("Team ID not found",t.getTeamID(),"Team");
	}
	@Test
	public void testCreateTeam() {
		assertTrue(t.createTeam("The boys", au));
	}
	}
