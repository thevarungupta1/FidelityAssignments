package com.company.Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FIlenotFound {

	public static void main(String[] args) throws IOException

	{
//		File file = new File("new.txt");
//		file.createNewFile();
		
		try
		{
		FileInputStream fis = new FileInputStream("newa.txt");
		int data1;
		while((data1 = fis.read()) != -1 )
		
		{
		System.out.print((char)data1);
	}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
		}
		
	}
