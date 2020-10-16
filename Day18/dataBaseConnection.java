package Day18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dataBaseConnection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/students";
		String username="root";
		String password="Puja@123";
		
		Connection con=DriverManager.getConnection(url, username, password);
		Statement stat=con.createStatement();
		String sql="select * from mcastudent where id='12'";
		ResultSet rs=stat.executeQuery(sql);
		while(rs.next())
		System.out.println(rs.getString("name"));
		
	}

}
