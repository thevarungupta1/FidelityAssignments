package ExceptionAssignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FilenotFoundException {

	static File f;
	public static void main(String[] args) throws FileNotFoundException {
		
		f= new File("C:\\testing.txt");
		FileReader fr = new FileReader(f);
		System.out.println(fr);
	}

}
