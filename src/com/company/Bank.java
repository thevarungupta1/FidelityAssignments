package com.company;
import java.util.Scanner;

public class Bank extends Student{
	
	
	String BankDetails;
	
	public Bank()
	{
		System.out.println("Bank Details are as follows : ");
		Scanner in = new Scanner(System.in);
		BankDetails = in.next();
		
}
	public static void main(String [] args)
	{
		Bank bn = new Bank ();
		bn.EnterStudentDetails();
		bn.DisplayStudentDetails();
	
		
	}
	
}
