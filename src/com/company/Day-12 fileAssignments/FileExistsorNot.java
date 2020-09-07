//Day-12: Write a Java program to check if a file or directory specified by pathname exists or not

package fileAssignments;

import java.io.File;
import java.io.IOException;

public class FileExistsorNot {
	public static void main(String[] args) throws IOException {
		File f=new File("Test.text");
		System.out.println(f.exists());
	    f.createNewFile();
		System.out.println(f.isDirectory());
	    System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());
	}
}
