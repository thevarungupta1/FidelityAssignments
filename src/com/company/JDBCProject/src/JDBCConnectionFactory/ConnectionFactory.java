package JDBCConnectionFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionFactory {
 
	public static Connection conn = null;
	
	public static Connection getConnection() throws SQLException {
		if(conn==null) {
			ResourceBundle Bundle = ResourceBundle.getBundle("JDBCConnectionFactory/dbConfig");
			String dc= Bundle.getString("DriverClass");
			String url= Bundle.getString("url");
			String username= Bundle.getString("username");
			
			String password= Bundle.getString("password");
			conn = DriverManager.getConnection(url,username,password);
		}
		return conn;
		
}
	
	
}
