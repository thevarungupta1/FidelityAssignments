package JDBCNormal;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;


public class CreateEmployeeTable {
public static void main(String args[]) throws ClassNotFoundException, SQLException {
	
	//load/initialize jdbc driver
	
	Class.forName("com.mysql.jdbc.Driver");
	
	//create connection to the DB
	
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproject","root","nehaneha05");
	
	// create statement;
	
	Statement statement = conn.createStatement();
	
	//sql query
	
	String sql= "create table employee(empid integer, empName char(50))";
	
	statement.execute(sql);
	
	//close connections
	
	statement.close();
	conn.close();
	
	
	
	
}

private static Connection DriverManager(String string, String string2, String string3) {
	// TODO Auto-generated method stub
	return null;
}
}
