package FileHandlingAssigment;

import java.io.File;

public class DirectoryExistorNot {

	static int count;
	public int directororfile() {

		File directory = new File("C:\\mohit\\FidelityAssignments\\src\\Files");
		if (directory.isDirectory()) 
		{
			File[] file =directory.listFiles();
			if(file.length!=0)
				count= file.length;
			return count;
		} else
			return count;

	}

	public static void main(String[] args) {
		DirectoryExistorNot obj = new DirectoryExistorNot();
		if (obj.directororfile()!=0) {
			System.out.println("Directory is present with "+count+" Files present inside it");
		} else {
			System.out.println("Directory is present but file are not present");
		}
	}
}
