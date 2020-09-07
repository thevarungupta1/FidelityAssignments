package Day12.Question4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAFile {
	public static void main(String args[]) throws IOException {
		BufferedReader rd = null;
		String name="";
		try {
			rd= new BufferedReader(new FileReader("C:\\AUTO\\labDetails.txt"));
			
			while((name= rd.readLine())!=null) {
				System.out.println(name);
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("File Not Found");
			e.printStackTrace();
			}
		catch(IOException e) {
			System.out.println("IO Exception occured");
			e.printStackTrace();
			}
		finally {
			try {
			rd.close();
			}
			catch(NullPointerException e) {
				System.out.println("Null pointer exception occured");
				e.printStackTrace();
			}
		}
		}
	}
		


