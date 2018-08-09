package moveTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import move.Register;

public class RegisterTest {

	Register r = new Register("johnboy@gmail.com", "password1","password1","John");
	@Test
	public void testRegister() {
		assertNotNull(r);	
	}
	@Test
	public void testGetEmail() {
		assertEquals("User has no email",r.registerAttempt("johnboy@gmail.com", "password1", "password1", "John"),"Login Successful!");
	}
	@Test
	public void testSetPassword() {
		r.setPassword("password1");
		assertEquals("?",r.registerAttempt("johnboy@gmail.com", "password1", "password1", "John"),"Login Successful!");
	}
	@Test
	public void testGetPassword() {
		assertEquals("User has no email",r.registerAttempt("johnboy@gmail.com", "password1", "password1", "John"),"Login Successful!");
	}
	@Test
	public void testSetEmail() {
		r.setEmail("johnboy@gmail.com");
		assertEquals("User has no password??",r.registerAttempt("johnboy@gmail.com", "password1", "password1", "John"),"Login Successful!");
	}
 // Do I need getters and setters for this? information isnt stored at this point.
}

