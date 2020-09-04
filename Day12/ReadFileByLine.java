package Day12;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileByLine {
    public static void main(String[] args) throws IOException
    {
    	FileInputStream fis=new FileInputStream("C:\\Users\\puja\\workspace\\Assigment\\src\\Day12\\test.txt");
    	Scanner sc=new Scanner(fis);
    	int ss;
    	while(sc.hasNextLine())
    	{
    		System.out.println(sc.nextLine());
    	}
    }
}
