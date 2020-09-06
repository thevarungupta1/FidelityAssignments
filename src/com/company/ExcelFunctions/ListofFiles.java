package com.company.ExcelFunctions;

import java.io.File;

public class ListofFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		File file = new File("Directory");
		String [] list = file.list();
		for(String s : list)
		{
			count++;
			System.out.println(s);
		}
		System.out.println("Total Count : " + count);
	}}		
		
		

