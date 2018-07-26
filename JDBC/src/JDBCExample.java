import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/sakila";
	
	static final String USER = "root";
		static final String Pass = "123456";

		public static void main(String[] args) {
		
			
		try( Connection conn = DriverManager.getConnection(DB_URL,USER,Pass);
				Statement stmt = conn.createStatement();) {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			System.out.println("Connecting to database...");
			System.out.println("Creating statement...");
			String sql; 
			sql = "Select last_name FROM actor";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String last = rs.getString("last_name");
				System.out.print(", Last: " + last);
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
	}

