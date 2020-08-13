package com.company;

import java.util.Scanner;

public class GetOddEvenNumbers {
	
	private static Scanner sc;
	public static void main(String[] args) 
	{
		sc=new Scanner(System.in);
		System.out.print("Enter your number :");
		int num = sc.nextInt(); // Read input from command line
		
		// if-else statement using ternary operator
		String number = (num%2==0)?"Number is Even number :" +num:"Number is Odd number :" +num;
		System.out.println(number);
		
	}

}
