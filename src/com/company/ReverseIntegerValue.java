package com.company;

import java.util.Scanner;

public class ReverseIntegerValue {
	
	
	private static Scanner sc;
	static int num;
	static int rev=0;
	static int remainder;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Enter digit :");
		num =sc.nextInt();
		
		while(num>0) // --> 356, 35, 3
		{
		remainder = num%10; // --> 6, 5, 3 
		num = num/10; //--> 35 --> 3 --> 0
		rev = remainder+rev*10; //-->6+0=6, --> 5+6*10=65 --> 3+65*10=653
		}
		System.out.print("Reverse number is "+rev);
	}

}
