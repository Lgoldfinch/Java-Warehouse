package move;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class Forum extends Comment {
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/movedb?serverTimezone=UTC";

	static final String USER = "root";
	static final String PASS = "root";	

	private String comment; 
	private int commentID, accountID, userID, teamID;
	
	
public Forum(int userID, String comment, int teamID) { // Will need users, will need text, will probably nick stuff from comment...
super(userID, comment);
}

public void initialiseForum() {
	
}


public void createNewThread(String threadName) {

}
}
//Might need to change column called thread. 