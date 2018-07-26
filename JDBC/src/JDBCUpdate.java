import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUpdate {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/sakila";  /// This example turns all the values within
                                                   // the city column in the city table to bosh and then retreives the values.
	static final String USER = "root";
	static final String Pass = "123456";

	public static void main(String[] args) {

		try( Connection conn = DriverManager.getConnection(DB_URL, USER,Pass);
				Statement stmt = conn.createStatement();) {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			System.out.println("Connecting to database...");
			System.out.println("Creating statement...");
			String sql = "UPDATE city " + 
					"SET city = 'bosh'  WHERE city_id in (1)";
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
