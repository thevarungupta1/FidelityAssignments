package com.company.Exceptions;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 500;
		int b = 0;
		
		try
		{
			int c = a/b;
		System.out.println("Value of c is : " + c);
	}
	catch(ArithmeticException e)	
		{
		System.out.println("Devided by Zero");
		}
		}
	}

