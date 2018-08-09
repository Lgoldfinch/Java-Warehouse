package moveTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import move.GuestUser;

public class GuestUserTest {
GuestUser gu = new GuestUser("jack@gmail.com",1);
	@Test
	public void testGuestUser () {
		assertNotNull(gu);
	}
	@Test
	public void testAdminToGuestConversion() {
		assertEquals("Account type remained as 2", gu.adminToGuestConversion(false, "jack@gmail.com"));
	}
}
//	@Test
//	public void testGuestToAdminConversion() {
//		assertTrue("Account type remained as 1", true);
//	}
//}
