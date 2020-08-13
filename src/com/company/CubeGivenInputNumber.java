package com.company;

import java.util.Scanner;

public class CubeGivenInputNumber {
	public static void main(String[] args) {

		//Creating object of Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number :");
		//Read input from keyboard and store in num variable

		int num = sc.nextInt();

		// Now use of Math.pow function and cast it result to integer and store in a
		// variable and then print

		int cube = (int) Math.pow(num, 3);
		System.out.print("Cube of number is :" + cube);
		
		sc.close();

	}
}
