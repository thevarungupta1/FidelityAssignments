//Day-12: Write a Java program to get a list of all file/directory names from the given
package fileAssignments;

import java.io.File;
import java.io.IOException;

public class AllFiles {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users");
		String[] s=f.list();
		for(String s1:s) {
			System.out.println(s1);
		}
	}
}
