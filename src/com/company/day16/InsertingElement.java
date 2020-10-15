//Write a Java program to insert elements into the linked list at the first and last position
package day16;

import java.util.ArrayList;
import java.util.LinkedList;

public class InsertingElement {

	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<String>();
		al.add("Joe");
		al.add("Pri");
		al.add("Neha");
		al.add("Abi");
		System.out.println("All elements of List: "+al);

		al.addFirst("Zeba");


		al.addLast("Ria");
		System.out.println("New linked list:" + al);  
	}

}


