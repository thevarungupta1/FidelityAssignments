package com.spring.SpringbootProject.entities;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	public int EmpId;
	public String EmpName;
	public String EmpEmail;
	
	Employee(){
		super();
	}
	
	Employee(int EmpId, String EmpName, String EmpEmail){
		super();
		this.EmpId= EmpId;
		this.EmpName =EmpName;
		this.EmpEmail=EmpEmail;
	}

	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpEmail=" + EmpEmail + "]";
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public String getEmpEmail() {
		return EmpEmail;
	}

	public void setEmpEmail(String empEmail) {
		EmpEmail = empEmail;
	}
	
	
	
	
}
