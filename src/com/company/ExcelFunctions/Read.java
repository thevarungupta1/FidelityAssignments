package com.company.ExcelFunctions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Read {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("Reading.txt");
		file.createNewFile();
		
		FileInputStream fis = new FileInputStream("Reading.txt");
		int data;
		
		while ((data = fis.read()) != -1)
		{
			System.out.print((char)data);
		}
		

	}

}
