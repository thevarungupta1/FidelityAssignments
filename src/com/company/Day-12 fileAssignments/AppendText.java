//Write a Java program to append text to an existing file
package fileAssignments;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendText {
	
	public static void main(String[] args) throws IOException {		
		BufferedWriter bw=new BufferedWriter(new FileWriter("Nehaa.txt", true));
		bw.write(100);
		bw.newLine();
		char c='a';
		bw.write(c);
		bw.newLine();
		bw.flush();
		bw.close();
	}

}
