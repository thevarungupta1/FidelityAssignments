package JDBCConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class MainDemo {
public static void main(String args[]) throws SQLException {
	//Class.forName(dc);
	
    Connection conn = ConnectionFactory.getConnection();
    Statement statement = conn.createStatement();
    String sql= "create table user2(id integer, salary char(50))";
    statement.execute(sql);
    statement.close();
    conn.close();
    
	
	
}
	
}
