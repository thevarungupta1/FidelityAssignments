package com.company;

public class Bank {
	String name;
	int number;
	int salary;

	public Bank(String name, int number, int salary) {
		this.name = name;
		this.number = number;
		this.salary = salary;
	}

	public void nameofEmployee() {
		System.out.println("Name of employee :" + name);
	}

	public void numberofEmployee() {
		System.out.println("No of employee :" + number);
	}

	public void salaryofEmployee() {
		System.out.println("No of employee :" + salary);
	}

	public static void main(String[] args) {
		Bank b = new Bank("Mohit", 10, 10000);
		b.nameofEmployee();
		b.numberofEmployee();
		b.salaryofEmployee();

	}

}
