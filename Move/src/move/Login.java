package move;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Login {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/movedb?serverTimezone=UTC";

	static final String USER = "root";
	static final String PASS = "root";

	private String email, password, emailAttempt, passwordAttempt;
	private boolean passwordSuccess, emailSuccess;

	public Login(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public String loginAttempt(String emailAttempt, String passwordAttempt) { 
		this.emailAttempt = emailAttempt;
		this.passwordAttempt = passwordAttempt;

		try( Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();) {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			System.out.println("Connecting to database..."); 
			System.out.println("Creating statement...");
			String sql; 
			sql = "SELECT Email FROM User WHERE Email ='"+emailAttempt+"'"; 
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				rs.first();
			}
				email = rs.getString("email");
			 
			if (email.length() == 0) {
				emailSuccess = false;

			}
			else if (email.equals(emailAttempt)){
				emailSuccess = true;
			}
			else {
				emailSuccess = true;
			}
			rs.close();

			String sql2;  
			sql2 = "SELECT Password FROM user WHERE Password ='"+passwordAttempt+"' AND Email = '"+emailAttempt+"'";
			ResultSet rs2 = stmt.executeQuery(sql2);
			if (rs2.next()) {
				rs2.first();
			}
			
			    password = rs2.getString("password"); 			
			if (password.length() == 0) {
				passwordSuccess = false;

			}
			else if (password.equals(passwordAttempt)) { 
				passwordSuccess = true;

			}
			else {
				passwordSuccess = false;
			}
			rs2.close();
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) { 
			e.printStackTrace();
		}

		if (passwordSuccess &&  emailSuccess) {  // More efficient if using switch statements?
			return "Login Successful!";
		}
		else {
			return "Login failed, try a different email and password.";
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}