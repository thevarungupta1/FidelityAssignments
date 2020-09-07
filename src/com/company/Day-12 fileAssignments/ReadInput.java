//Day12: Write Java program to read input from java console
package fileAssignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInput {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your input: ");
		String input=br.readLine();
		System.out.println("Reading input from console: "+input);
	}
}
