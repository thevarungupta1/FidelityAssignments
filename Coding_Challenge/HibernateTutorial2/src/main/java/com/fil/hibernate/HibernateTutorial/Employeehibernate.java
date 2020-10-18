package com.fil.hibernate.HibernateTutorial;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Employeehibernate {

	@Id
	private int emp_Id;
	private String emp_Name;
	private String emp_Designation;
	public int getEmp_Id() {
		return emp_Id;
	}
	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}
	public String getEmp_Name() {
		return emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}
	public String getEmp_Designation() {
		return emp_Designation;
	}
	public void setEmp_Designation(String emp_Designation) {
		this.emp_Designation = emp_Designation;
	}
	@Override
	public String toString() {
		return "Emp_Id=" + emp_Id + "\n" +"Emp_Name=" + emp_Name + "\n"+"Emp_Designation=" + emp_Designation;
	}
	
	
	
}
