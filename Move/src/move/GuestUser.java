package move;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class GuestUser extends User {
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/movedb?serverTimezone=UTC";

	static final String USER = "root";
	static final String PASS = "root";
	
	private String email;
	private boolean paid;
	private int userID, accountID;

	public GuestUser(String email, int userID) {
		super(email, userID);
	}

	public int getAccountID() {
		return accountID;
	}

	public String adminToGuestConversion() {
		return adminToGuestConversion(isPaid(), email);

	}
	public boolean guestToAdminConversion() {
		return guestToAdminConversion(isPaid(), email);
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}