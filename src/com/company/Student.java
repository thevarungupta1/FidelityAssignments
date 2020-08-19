package com.company;
import java.util.Scanner;

public class Student {

	int roll_No;
	String Name;
	int Section;
	
	public void EnterStudentDetails()
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Student name : " );
		Name = in.next();
		System.out.println("Enter Student Roll No : "  );
		roll_No = in.nextInt();
		System.out.println("Enter Section : " );
		Section = in.nextInt();
	}
	
	public void DisplayStudentDetails()
	{
		System.out.println("Enter Student name : " + Name );
		System.out.println("Enter  : "  + roll_No);
		System.out.println("Enter Section : "  + Section);
	}
	
		public static void main(String[] args)
		{
			Student student1 = new Student();
			student1.EnterStudentDetails();
			student1.DisplayStudentDetails();
		}

}



