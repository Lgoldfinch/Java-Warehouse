package move;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Team {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/movedb?serverTimezone=UTC";

	static final String USER = "root";
	static final String PASS = "root";
	private int accountID;
	private int teamID;
	private String teamName;
	private String userID;
	private String email;

	public Team(adminUser, guestUser) {}

	public boolean createTeam(String teamName, String email) {
		try( Connection conn = DriverManager.getConnection(DB_URL,USER,PASS); 
				Statement stmt = conn.createStatement();) {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			System.out.println("Connecting to database...");
			System.out.println("Creating statement...");

			String sql; 
			sql = "SELECT Account_id FROM User Where email ='"+email+"'";
			stmt.executeQuery(sql);
			ResultSet rs = stmt.executeQuery(sql); 
			while(rs.next()) {
				int accountID = rs.getInt("account_id");
				this.accountID = accountID;

				if (accountID == 2) {
					String sql2 = "SELECT User_id FROM User ORDER BY User_id DESC LIMIT 1";
					ResultSet rs2 = stmt.executeQuery(sql2); 
					while(rs2.next()) {
						int teamID = rs2.getInt("Team_id");
						this.teamID = teamID + 1;
						String sql3 = "INSERT INTO Team VALUES ('"+teamID+"','"+teamName+"')";
						stmt.executeQuery(sql3);
					}
					return true;
				}
				else {
					return false; 
				}
				rs.close();
			}
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) { 
			e.printStackTrace();
		}
	}

	public boolean deleteTeam(int teamID, String email) {
		try( Connection conn = DriverManager.getConnection(DB_URL,USER,PASS); 
				Statement stmt = conn.createStatement();) {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			System.out.println("Connecting to database...");
			System.out.println("Creating statement...");

			String sql; 
			sql = "SELECT Account_id FROM User Where email ='"+email+"'";
			stmt.executeQuery(sql);
			ResultSet rs = stmt.executeQuery(sql); 
			while(rs.next()) {
				int accountID = rs.getInt("account_id");
				this.accountID = accountID;

				if (accountID == 2) {
					String sql2 = "DELETE FROM Team WHERE Team_id ='"+teamID+"'"; // Might need a different input to teamID.
					stmt.executeUpdate(sql2); 
					return true;
				}
				else {
					return false; 
				}
			}
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) { 
			e.printStackTrace();
		}
	}

	public boolean addPlayer(int teamID, int userID) { 
		try( Connection conn = DriverManager.getConnection(DB_URL,USER,PASS); 
				Statement stmt = conn.createStatement();) {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			System.out.println("Connecting to database...");
			System.out.println("Creating statement...");

			String sql; 
			sql = "SELECT Account_id FROM User Where email ='"+email+"'"; // I created a field for this, not sure if this will work.
			stmt.executeQuery(sql);
			ResultSet rs = stmt.executeQuery(sql); 
			while(rs.next()) {
				int accountID = rs.getInt("account_id");                    // User's must be in team surely? 
				this.accountID = accountID;
				if (accountID == 2) { 
					String sql2 = "UPDATE User SET team_id = '"+teamID+"' WHERE user_ID = '"+userID+"'";
					return true;
				}
				else {
					return false; 
				}
			}
			rs.close();
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) { 
			e.printStackTrace();
		}
	}

	public int getTeamID() {
		return teamID;
	}

	public void setTeamID(int teamID) {
		this.teamID = teamID;
	}
}