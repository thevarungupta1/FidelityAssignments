package Exception_assigment;
import java.io.*;

public class FileNotFoundExcep {
	public static void main(String[] args)throws FileNotFoundException
	{
		
		File file=new File("D:\\test.txt");
		try
		{
			FileInputStream fis = new FileInputStream(file);
		      System.out.println("Hello");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
