//Write a Java program to retrieve an element (at a specified index) from a given array list
package day16;

import java.util.ArrayList;

public class RetrieveFromArrayList {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Joe");
		al.add("Pri");
		al.add("Neha");
		al.add("Abi");
		System.out.println("All elements of ArrayList: "+al);
		
		String position=al.get(1);
		System.out.println("Element position is: "+position);
		    }

	}


