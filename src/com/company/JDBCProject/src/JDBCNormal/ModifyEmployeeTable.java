package JDBCNormal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ModifyEmployeeTable {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		String url= "jdbc:mysql://localhost:3306/jdbcproject";
		String username="root";
		String password= "nehaneha05";
		Connection con = DriverManager.getConnection(url, username, password);
		
		Statement statement= con.createStatement();
		// insert new record
		String sql="insert into employee values(2,'ekta')";
		
		//update a record
		
		//String sql1= "update employee set empName='ekta' where empid=1";
		
		//int numberofRowsEffected = statement.executeUpdate(sql);
		
		//delete a record
	
		//String sql= "delete from employee where empid= 1";
		
		//drop a table
		
		//String sql= "drop table employee";
		
		int numberofRowsEffected = statement.executeUpdate(sql);
		
		System.out.println(numberofRowsEffected+ " number of rows effected");
		
		statement.close();
		con.close();
		
		
		
		
	}

}
