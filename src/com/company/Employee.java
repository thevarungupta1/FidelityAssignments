package com.company;

public class Employee {

	int Employee_No;
	String EmployeeName;
	String Employee_Details;
	
	Employee()
	{
		Employee_No = 5;
		EmployeeName = "Himanshu";
		Employee_Details = "Student";
		System.out.println("Employee details are as follows : " + Employee_No + " " + EmployeeName + " " + Employee_Details);
		
	}
	
	public static void main(String[] args)
	{
	Employee emp = new Employee();
	}		
			
}
