package Day12;

import java.io.File;

public class CountFiles {
	public static void main(String[] args)
	{
		File file=new File("C:\\Users\\puja\\workspace\\Assigment\\src\\Day12");
		int count=file.list().length;
		
		System.out.println("file in current :-"+count);
	}

}
