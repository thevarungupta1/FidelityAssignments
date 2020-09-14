package com.company.ExcelFunctions;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream fos = new FileOutputStream("Reading.txt", true);
		String text =  "\n My Name is Himanshu"
				+ "\n Expecting it in next line";
		fos.write(text.getBytes());
		fos.flush();
		System.out.println("Text Entered");
		fos.close();
		
	}

}
