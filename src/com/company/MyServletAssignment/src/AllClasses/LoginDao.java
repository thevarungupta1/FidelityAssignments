package AllClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginDao {

	public static boolean validate(String e, String p) {
		boolean status = false;
		try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myservletdb", "root","nehaneha05");
				PreparedStatement statement = conn.prepareStatement("select * from myservlettable where email=? and pass=?");
				statement.setString(1, e);
				statement.setString(2,p);
				ResultSet rs = statement.executeQuery();
				status = rs.next();
		}
		catch(Exception a) {
			System.out.println(a);
		}
		return status;
	}
}
