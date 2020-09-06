package com.company.ExcelFunctions;

import java.io.File;
import java.io.IOException;

public class CheckifFileExists {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("DIRECTORY", "fileindirectory2.txt");
		System.out.println(file.exists());
		file.createNewFile();
		//file.mkdir();
		//file.delete();
		System.out.println(file.exists());
	}

}
