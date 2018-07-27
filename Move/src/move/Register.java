package move;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Register {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/sakila";

	static final String USER = "root";
	static final String Pass = "123456";

	private String Email, Password, Name, confirmPassword; // Might need to split first and second names

	public Register(String Email, String Password, String confirmPassword, String Name) {
		this.Email= Email;
		this.Password = Password;
		this.Name = Name; 
//		this.confirmPassword = confirmPassword;
	}
	public String registerAttempt(String Password, String Email, String Name) { 
		this.Email = Email;
		this.Password = Password; 
		this.Name = Name;
//		this.confirmPassword = confirmPassword;



		try( Connection conn = DriverManager.getConnection(DB_URL,USER,Pass); // Insert email
				Statement stmt = conn.createStatement();) {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			System.out.println("Connecting to database...");
			System.out.println("Creating statement...");
			String sql; 
			sql = "INSERT INTO Email IF NOT EXISTS"
					+ Email;
			stmt.executeQuery(sql);
			System.out.print("Inserted a new email into the registry.");
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) { 
			e.printStackTrace();
		}

		// what will the code do if the email already exists? 

		try( Connection conn = DriverManager.getConnection(DB_URL,USER,Pass); // Insert Password
				Statement stmt = conn.createStatement();) {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			System.out.println("Connecting to database...");
			System.out.println("Creating statement...");
			String sql; 
			sql = "INSERT INTO Password "
					+ Password;
			stmt.executeQuery(sql);
			System.out.print("Inserted a new password into the registry.");
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) { 
			e.printStackTrace();
		}

		try( Connection conn = DriverManager.getConnection(DB_URL,USER,Pass); // Insert Name
				Statement stmt = conn.createStatement();) {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			System.out.println("Connecting to database...");
			System.out.println("Creating statement...");
			String sql; 
			sql = "INSERT INTO Name "
					+ Name;
			stmt.executeQuery(sql);
			System.out.print("Inserted a new name into the registry.");
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) { 
			e.printStackTrace();

		}

//		try( Connection conn = DriverManager.getConnection(DB_URL,USER,Pass); // Confirm Password
//				Statement stmt = conn.createStatement();) {
//			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
//			System.out.println("Connecting to database...");
//			System.out.println("Creating statement...");
//			String sql; 
//			sql = " INTO Password "
//					+ Password;
//			stmt.executeQuery(sql);
//			System.out.print("Inserted a new password into the registry.");
//		}
//		catch(SQLException se) {
//			se.printStackTrace();
//		}
//		catch(Exception e) { 
//			e.printStackTrace();
//		}



		return "bleh";
	}
    public int generateUserID() {
    	registerAttempt(String email, String password, String name) {
    		
    	}
    }

	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
}