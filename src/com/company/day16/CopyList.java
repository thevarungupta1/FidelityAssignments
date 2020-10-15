//Write a Java program to copy one array list into another

package day16;

import java.util.ArrayList;

public class CopyList {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Apple");
	     al.add("Orange");
	     al.add("Mango");
	     al.add("Grapes");
	     System.out.println("Original ArrayList: "+al);

	     ArrayList<String> al2 = (ArrayList<String>)al.clone();
	     System.out.println("Cloned ArrayList: "+ al2);
	
	}
}
