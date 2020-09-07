package Day12.Question5;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class AppendText {
	public static void main(String args[]) throws IOException {
		String name= "NEHA BHARTI";
	try {
		FileWriter fr= new FileWriter("C:\\AUTOMATION\\labDetails.txt", true);
		BufferedWriter bw = new BufferedWriter(fr);
		bw.write(name);
	}
	catch(FileNotFoundException e) {
		System.out.println("File Not Found");
		e.printStackTrace();
		}
	catch(IOException e) {
		System.out.println("IO Exception occured");
		e.printStackTrace();
		}
		
		
		
		
	}

}
