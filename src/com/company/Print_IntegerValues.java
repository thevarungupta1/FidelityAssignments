package com.company;

import java.util.Scanner;

public class Print_IntegerValues{
	private static Scanner sc;
	public static void main(String args[]) 
	{
		int num,i;
		sc = new Scanner(System.in);
		System.out.print("Enter number till where you want to print :");
		num = sc.nextInt();
		
		for (i = 1; i<=num; i++) 
		{
			System.out.println("Print Integer value :"+i);
		}
		sc.close();
	}
}
