//demonstrate FileNotFoundException
package exceptionsAssignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTwo{

	public static void main(String[] args) throws FileNotFoundException {
		File file=new File("abc");
		FileInputStream fis=new FileInputStream(file);
		System.out.println("Print error!");
	}
}
