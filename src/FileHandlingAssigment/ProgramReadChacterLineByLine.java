package FileHandlingAssigment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ProgramReadChacterLineByLine {
 static int i;
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\mohit\\FidelityAssignments\\src\\Files\\MultipleLines");
		FileReader file = new FileReader(f);
		try {
			while((i=file.read())!=-1)
			{
				System.out.print((char)i);
			
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		file.close();

	}
	

}
