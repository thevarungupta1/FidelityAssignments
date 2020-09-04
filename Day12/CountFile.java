package Day12;

import java.io.File;

public class CountFile {
	public static void main(String[] args)
	{
		  int count = 0;
	        File file= new File("directory");
	        String[] list = file.list();
	        for (String c: list){
	            File f = new File(file, c);
	            if(f.isFile()){
	                count++;
	                System.out.println(c);
	            }
              System.out.println(count);
	        }
	}

}
