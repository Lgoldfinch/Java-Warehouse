package move;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Comment{

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/movedb?serverTimezone=UTC"; // Will need the time changed here.

	static final String USER = "root";
	static final String Pass = "root";

	private String AdminUser, GuestUser, comment; //Might be better to be use them as objects not strings?
	private int commentID, accountID;
	public Comment(int userID, String comment) {
		this.comment = comment;
	}

	public String leaveComment(int UserID, String comment) {  // Could use AdminUser and GuestUser as objects in this potentially? Need to generate a comment ID.

		try( Connection conn = DriverManager.getConnection(DB_URL,USER,Pass);
				Statement stmt = conn.createStatement();) {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			System.out.println("Connecting to database...");
			System.out.println("Creating statement...");
			String sql = "SELECT comment_id FROM comment ORDER BY User_id DESC LIMIT 1";
			ResultSet rs = stmt.executeQuery(sql); 
			while(rs.next()) {
				int commentID = rs.getInt("comment_id");
				this.commentID = commentID + 1;
			}
			rs.close(); 
			String sql2 = "SELECT account_id FROM comment WHERE account_id = '"+UserID+"'";
			ResultSet rs2 = stmt.executeQuery(sql2);
			if (rs2.next()) {
				rs2.first(); 
			}
			accountID = rs2.getInt("account_id");
			rs2.close(); 
			String sql3 = "INSERT INTO Comment VALUES ('"+commentID+"','"+UserID+"', '"+comment+"', '"+accountID+"')";  // Add in CommentID, remember that timestamp was meant to be in the SQL table.
			stmt.executeUpdate(sql3);

		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) { 
			e.printStackTrace();
		}
		return "Comment successful";
	}

	public String deleteOwnComment(int UserID, int commentID) {

		try(Connection conn = DriverManager.getConnection(DB_URL,USER,Pass);
				Statement stmt = conn.createStatement();) {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			System.out.println("Connecting to database...");
			System.out.println("Creating statement...");
			String sql = "DELETE FROM Comment WHERE USER_ID = '"+UserID+"' && Comment_ID = '"+commentID+"'";
			stmt.executeUpdate(sql);
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) { 
			e.printStackTrace();
		}
		System.out.println("Comment deleted.");

		return "Comment deleted"; 
	}
	public boolean adminDeleteComment(int userID, int commentID) {
		try( Connection conn = DriverManager.getConnection(DB_URL,USER,Pass);
				Statement stmt = conn.createStatement();) {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			System.out.println("Connecting to database...");
			System.out.println("Creating statement...");

			String sql = "SELECT account_id FROM Comment WHERE User_ID = '"+userID+"' && Comment_ID = '"+commentID+"'";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int accountID = rs.getInt("account_id");
				if (accountID == 2) {
					String sql2 = "Delete FROM Comment WHERE comment_id = '"+commentID+"'";	
					stmt.executeUpdate(sql2);
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
	public boolean editComment(int commentID, String updatedComment) {
		try( Connection conn = DriverManager.getConnection(DB_URL,USER,Pass);
				Statement stmt = conn.createStatement();) {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			System.out.println("Connecting to database...");
			System.out.println("Creating statement...");
			String sql = "UPDATE comment SET text = '"+updatedComment+"' WHERE comment_ID = '"+commentID+"'";
			stmt.executeUpdate(sql);
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) { 
			e.printStackTrace();
		}
	}
}

//sql = "SELECT User ID FROM Comment WHERE User_ID = '"+UserID+"' && Comment_ID = '"+commentID+"'"; // might need a join table here....need account type from UserID 
// Delete scenarios:
// 1) you try to delete your own comment. Need to know, the comment you want to delete (comment ID), where the person who wants to delete it (UserID);
// Account ID, not fixed to the UserID in SQL. (Look at the comments table if you cant remember)
// Need to make Account ID a foreign key in SQL.
