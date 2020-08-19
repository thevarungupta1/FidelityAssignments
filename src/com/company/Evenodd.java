package com.company;
import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		System.out.println("Enter Number to check odd even");
		
		int b = a%2;
		if (b == 0)
		{
			System.out.println("Entered Number is Evn");
		}
		else 
		{
			System.out.println("Entered number is odd");
		}
		}

	}


