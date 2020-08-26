package com.company;

import java.util.Scanner;

public class CalculateSalary {

	static int basic_Salary;
	static int HRA;
	static int DA;
	static int salary;
	static double taxpaid;
	static Scanner sc;
	double sal = 0;
	public void enterValues() {
		sc = new Scanner(System.in);
		System.out.print("Enter basic salary :");
		basic_Salary = sc.nextInt();
		System.out.print("Enter HRA :");
		HRA = sc.nextInt();
		System.out.print("Enter DA :");
		DA = sc.nextInt();
		salary = basic_Salary + HRA + DA;
		sal = salary*12;
		System.out.println("Salary of employee before tax deduction :"+sal);
	}

	public void display(double s) {
		
		System.out.println("Salary of employee after tax deduction :"+s);
	}

	
	public double calculation() {
		salary = basic_Salary + HRA + DA;
		sal = salary*12;
		double salary_after_tax = 0;
		double tax=0;
		if(sal<500000) {
			tax = 0;
			salary_after_tax = sal-tax;
		}
		else if (sal >= 500000 && sal <= 1000000)
		{
			tax =sal*0.01;
			salary_after_tax = sal-tax;
		}
		else if (sal > 1000000 && sal <= 2000000)
		{
			tax =sal*0.02;
			salary_after_tax = sal-tax;
		}
		return salary_after_tax;

	}

	public static void main(String[] args) {
		CalculateSalary cs = new CalculateSalary();
		cs.enterValues();
		double sal_after_tax_deduction = cs.calculation();
		cs.display(sal_after_tax_deduction);
	}

}
