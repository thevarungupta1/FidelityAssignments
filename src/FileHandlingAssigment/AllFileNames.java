package FileHandlingAssigment;

import java.io.File;

public class AllFileNames {

	public void fileordirectorynames() {
		File f = new File("C:\\mohit\\FidelityAssignments\\src\\Files");
		if(f.exists())
		{
			System.out.println("Folder Name :"+f.getName());
			for(String s :f.list())
			{
				System.out.println("File Name :"+s);
			}
		}
		
	}
	public static void main(String[] args) {
		
		AllFileNames names = new AllFileNames();
		names.fileordirectorynames();
	}

}
