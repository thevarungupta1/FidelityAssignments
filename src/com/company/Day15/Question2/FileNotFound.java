package ExceptionHandling.Question2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class FileNotFound {
	
	public static final String filename="book.txt";
	

public static void main(String args[]) throws IOException {
	BufferedReader rd= null;
	try {
		rd= new BufferedReader(new FileReader(new File(filename)));
		String inputLine = null;
		while((inputLine = rd.readLine())!=null ) {
			System.out.println(inputLine);
		}
	}
		catch(IOException e) {
			e.printStackTrace();
		}
	finally {
		try {
			rd.close();
		}
		catch(NullPointerException e) {
			System.out.println("Exception here");
			e.printStackTrace();
		}
		
	}
	
}
}