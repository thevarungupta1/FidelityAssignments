package com.company;

import java.util.Scanner;

public class PrintAnyTable {

	private static Scanner sc;
	static int i=1;
	public static void main(String[] args) 
	{
		sc= new Scanner(System.in);
		System.out.print("Enter number for which you wnat to print Table");
		int num = sc.nextInt();
		
		while(i<=10)
		{
			System.out.println(num+"\t"+"*"+"\t"+i+"\t"+"="+" "+num*i);
			i++;
		}
		
	}

}
