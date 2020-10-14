package com.spring.SpringProject;

public class Student {
	private int StudentId;
	private String StudentName;
	private String StudentEmail;
	
	Student(){
		
	}
	Student(int StudentId, String StudentName, String StudentEmail){
		this.StudentId = StudentId;
		this.StudentName = StudentName;
		this.StudentEmail = StudentEmail;
	}
	
	public void setStudentId(int StudentId) {
		this.StudentId = StudentId;
	}
	
	public int getStudentId() {
		return this.StudentId;
	}
	
	public void setStudentName(String StudentName) {
		this.StudentName = StudentName;
	}
	
	public String getStudentName() {
		return this.StudentName;
	}
	
	public void setStudentEmail(String StudentEmail) {
		this.StudentEmail = StudentEmail;
	}
	
	public String getStudentEamil() {
		return this.StudentEmail;
	}
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentEmail=" + StudentEmail
				+ "]";
	}
	
	

}
