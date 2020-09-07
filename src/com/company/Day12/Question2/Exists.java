package Day12.Question2;

import java.io.File;

public class Exists {
public static void main(String args[]) {
	File file = new File("labDetails.txt");
	if(file.exists()) {
		System.out.println("This file exists");
	}
	else {
		System.out.println("This file does not exist");
	}
}
}
