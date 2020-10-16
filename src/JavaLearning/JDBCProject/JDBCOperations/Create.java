package JavaLearning.JDBCProject.JDBCOperations;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Create {
    public static void main(String args[]) throws ClassNotFoundException, SQLException, IOException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproject","root","password");
        Statement statement = conn.createStatement();
        String sql= "create table employee(empid integer, empName char(50))";
        statement.execute(sql);
        statement.close();
        conn.close();
    }

    private static Connection DriverManager(String a, String b, String c) {
        return null;
    }
}
