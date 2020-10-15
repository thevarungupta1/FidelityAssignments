// Write a Java program to insert an element into the array list at the first position
package day16;

import java.util.ArrayList;

public class InsertIntoArrayList {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Joe");
		al.add("Pri");
		al.add("Neha");
		al.add("Abi");
		System.out.println("ArrayList is: "+al);
		
		al.add(0,"Julius");
		System.out.println("New ArrayList is: "+al);

	}

}
