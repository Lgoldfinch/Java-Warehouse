package moveTest;

import static org.junit.Assert.*;

import org.junit.Test;

import move.Login;

public class LoginTest {
    Login l = new Login("johnboy@gmail.com","password1");
	@Test 
	public void testlogin() {
		assertNotNull(l);	
	}
	@Test
	public void testGetPassword() {
		assertEquals("User has no password",l.loginAttempt("johnboy@gmail.com","password1"),"Login Successful!"); 
	}
	@Test
	public void testSetPassword() {
		l.setPassword("password1");
		assertEquals("?",l.loginAttempt("johnboy@gmail.com","password1"),"Login Successful!"); //unsure
	}

	@Test
	public void testSetEmail() {
		assertEquals("User has no email",l.loginAttempt("johnboy@gmail.com","password1"),"Login Successful!"); // Arent two of these tests doing the same thing??
	}
	@Test
	public void testGetEmail() {
		l.setEmail("johnboy@gmail.com");
		assertEquals("User has no password??",l.loginAttempt("johnboy@gmail.com","password1"),"Login Successful!");
	}
}
