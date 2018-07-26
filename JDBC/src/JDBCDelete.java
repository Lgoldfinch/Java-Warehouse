import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDelete {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; /// This would delete stuff if there wasn't a foreign key constaint. 
	static final String DB_URL = "jdbc:mysql://localhost/sakila";
	
	static final String USER = "root";
	static final String Pass = "123456";
	
	public static void main(String[] args) {
		

		try( Connection conn = DriverManager.getConnection(DB_URL,USER,Pass);
				Statement stmt = conn.createStatement();) {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			System.out.println("Connecting to database...");
			System.out.println("Creating statement...");
			String sql  = "DELETE FROM city " +
			"Where city_id = 1";
			stmt.executeUpdate(sql);
            
			sql = "SELECT city, city_id, country_id FROM city;";
			ResultSet rs = stmt.executeQuery(sql);
		
			while(rs.next()){
				int cityId = rs.getInt("city_id");
				int countryId = rs.getInt("country_id");
				String city = rs.getString("city");
				
				System.out.print("City:" + city);
				System.out.print(", City ID:" + cityId);
				System.out.println(", Country ID:" + countryId);
			}
			rs.close();
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) { 
			e.printStackTrace();
		}
		System.out.println("Goodbye!");
	}
	}


