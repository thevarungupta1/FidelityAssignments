package com.company;

public class NumberReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 4531;
		int rem = 0;
		
		while (num != 0 )
		{
			int digit = num % 10;       
			rem = rem * 10 + digit;
			num = num / 10;
		}
		
		System.out.println("Reverse Number is " + rem);
	
}}


//3*100 + 5*10 + 4
//
//3
//35
//354