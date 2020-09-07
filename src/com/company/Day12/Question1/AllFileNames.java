package Day12.Question1;

import java.io.File;

public class AllFileNames {
	public static void main(String args[]) {
		File file = new File("C:\\AUTOMATION");
		String[] allfiles= file.list();
		for(String s:allfiles) {
			System.out.println(s);
		}
		
	}

}
