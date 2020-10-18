package ReadAndWriteDetailsFromDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Employee {
	private String EmpName;
	private int EmpId;
	private String EmpEmail;
	
	Employee(String EmpName,int EmpId, String EmpEmail){
		this.EmpName= EmpName;
		this.EmpId = EmpId;
		this.EmpEmail = EmpEmail;
	}

	@Override
	public String toString() {
		return "Employee [EmpName=" + EmpName + ", EmpId=" + EmpId + ", EmpEmail=" + EmpEmail + "]";
	}
	

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getEmpEmail() {
		return EmpEmail;
	}

	public void setEmpEmail(String empEmail) {
		EmpEmail = empEmail;
	}
	
	public void performOperation() throws SQLException {
		Connection conn = ConnectionFactory.getConnection();
	    Statement statement = conn.createStatement();
		System.out.println("Please select option 1 or 2");
		Scanner s = new Scanner(System.in);
		int option = s.nextInt();
		if(option==1) {
	
//			   String name = getEmpName();
//				int id= getEmpId();
//				String email= getEmpEmail();
//				
//			  try{
//			        String sql = "INSERT INTO employee(EmpName, EmpId,EmpEmail) VALUES(?,?,?)";
//			        PreparedStatement statement1 = conn.prepareStatement(sql);
//			        statement1.setString(1,name);
//			        statement1.setInt(2,id);
//			        statement1.setString(3, email);
//			    	int numberofRowsEffected = statement1.executeUpdate(sql);
//			    	System.out.println(numberofRowsEffected+ " number of rows effected");
//			     }catch(SQLException e){
//                   System.out.println(e.toString());
//			     }
			  
			String sql = "insert into employee values ("+getEmpName()+", '"+getEmpId()+"', '"+getEmpEmail()+"')";
			int numberofRowsEffected = statement.executeUpdate(sql);
			System.out.println(numberofRowsEffected+ " number of rows effected");
			  
			 
			
		}
		else if(option==2) {
			String sql="Select * from employee";
			ResultSet rs= statement.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println("EmpName: " +rs.getString(1)+ "|" + "EmpId: " +rs.getString(2)+ "|" + "EmpEmail: " +rs.getString(3));
				
	 		}
		}
		
		statement.close();
		conn.close();
		
	}


	
	

}
