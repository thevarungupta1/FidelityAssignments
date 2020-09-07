package FileHandlingAssigment;

import java.io.FileOutputStream;
import java.io.IOException;

public class AppendTextinFile {

	public void modifyFileContent() throws IOException {
		FileOutputStream fo = new FileOutputStream("C:\\mohit\\FidelityAssignments\\src\\Files\\AppendFile", true);
		String s = "New line append in file";
		fo.write(s.getBytes());
		System.out.println("data is saved");
		fo.flush();
		fo.close();
	}

	public static void main(String[] args) throws IOException {
		AppendTextinFile obj = new AppendTextinFile();
		obj.modifyFileContent();
	}

}
