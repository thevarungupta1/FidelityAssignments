package com.company.ExcelFunctions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadingfromConsole {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		String name = reader.readLine();
//		System.out.println(name);
		
		Scanner in = new Scanner(System.in);
				
		String s = in.nextLine();
		System.out.println("Entered String is " + s );
		
		int a = in.nextInt();
		System.out.println("Entered number is " + a);
	
		float f = in.nextFloat();
		System.out.println("Floating number is" +f);
	}

}
