//Day:12- Write a Java program to read a file content line by line

package fileAssignments;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadLine_File {

	public static void main(String[] args) throws Exception {
		BufferedWriter bw = new BufferedWriter(new FileWriter("Neha.txt"));
		bw.write("Java writer file");
		bw.newLine();
		bw.write(100);
		bw.newLine();
		char[] ch= {'a','b','c'};
		bw.write(ch);
		bw.newLine();
		bw.flush();
		bw.close();
		
		BufferedReader br=new BufferedReader(new FileReader("Neha.txt"));
		String line=br.readLine();
		while(line!=null) {
			System.out.println("File content line by line: "+line);
			line=br.readLine();
		}
		br.close();
	}

}
