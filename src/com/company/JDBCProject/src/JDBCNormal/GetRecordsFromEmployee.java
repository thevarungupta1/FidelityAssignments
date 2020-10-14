package JDBCNormal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class GetRecordsFromEmployee {
	public static void main(String args[]) throws ClassNotFoundException , SQLException{
		
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/jdbcproject";
		String username= "root";
		String password="nehaneha05";
		
		Connection conn= DriverManager.getConnection(url,username,password);
		
		Statement statement= conn.createStatement();
		
		String sql="Select * from employee";
		ResultSet rs= statement.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println("empId: " +rs.getString(1)+ "|" + "empName: " +rs.getString(2));
			
 		}
		
	}

}
