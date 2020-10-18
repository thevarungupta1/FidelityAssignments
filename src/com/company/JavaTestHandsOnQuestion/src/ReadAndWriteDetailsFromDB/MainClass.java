package ReadAndWriteDetailsFromDB;

import java.sql.SQLException;

public class MainClass {
public static void main(String args[]) throws SQLException {
	Employee emp = new Employee("neha", 1,"n@gmail.com");
	emp.performOperation();
	
}
}
