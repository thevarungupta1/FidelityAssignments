package com.company;
import java.util.Scanner;

public class Salary {
	
	int basic;
	int HRA;
	int DA;
	double totalSalary;
	float TaxPercent;
	
	public void EnterEmployeeDetails()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Basic Salary" );
		basic = in.nextInt();
		System.out.println("Enter HRA" );
		HRA = in.nextInt();
		System.out.println("Enter DA");
		DA = in.nextInt();
	}
	
	public void TaxPercent()
	{
		totalSalary = basic + HRA + DA ;
		if (totalSalary < 10000)
		{
			System.out.println( "TaxPercent = : 10% ");
		}
			else if(totalSalary > 10000 && totalSalary < 500000)
			{
						System.out.println( "TaxPercent = : 20% ");
			}
			else
			{
				System.out.println( "TaxPercent = : 30% ");
		}
			
	}

	public void displayEmployeeDetails()
	{
		System.out.println("Basic Salary : " + basic);
		System.out.println("HRA : " + HRA );
		System.out.println("DA : " + DA);
	}
	
	public static void main(String[] args) {
		Salary sa = new Salary();
		sa.EnterEmployeeDetails();
		sa.displayEmployeeDetails();
		sa.TaxPercent();
		// TODO Auto-generated method stub

	}

}
