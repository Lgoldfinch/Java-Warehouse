package move;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Register {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/movedb?serverTimezone=UTC";

	static final String USER = "root";
	static final String PASS = "root";


	private String email, password, name, confirmPassword; // Might need to split first and second names
	private int userID;


	public Register(String email, String password, String confirmPassword, String name) {
		this.email= email;
		this.password = password;
		this.name = name; 
		this.confirmPassword = confirmPassword;
	}

	public String registerAttempt(String password, String confirmPassword, String Email, String Name) { 
		
		try( Connection conn = DriverManager.getConnection(DB_URL,USER,PASS); 
				Statement stmt = conn.createStatement();) {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			System.out.println("Connecting to database...");
			System.out.println("Creating statement...");

			String sql; 
			sql = "SELECT User_id FROM User ORDER BY User_id DESC LIMIT 1";
			ResultSet rs = stmt.executeQuery(sql); 
			while(rs.next()) {
				int userID = rs.getInt("User_id");
				this.userID = userID + 1;
			}
			rs.close();
			String sql2;
			sql2 = "INSERT INTO user " + "Values('"+userID+"','"+name+"','"+email+"','"+password+"','1','0')";
			stmt.executeUpdate(sql2);
			
			String sql3;
			sql3 ="SELECT password FROM User WHERE email = '"+email+"'";
			ResultSet rs2 = stmt.executeQuery(sql3);
			if (rs2.next()) {
				rs.first();
			}
			    password = rs2.getString("password");
			    
				if (password.equals(confirmPassword)) {
				}
				else {
					return "Passwords do not match. Please try again."; 
				}
			}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(Exception e) { 
			e.printStackTrace();
		}
		return "";
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}