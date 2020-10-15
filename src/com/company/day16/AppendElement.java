//Write a Java program to append the specified element to the end of a linked list
package day16;

import java.util.LinkedList;

public class AppendElement {

	public static void main(String[] args) {
		LinkedList<String> linkedlist = new LinkedList<String>();
		 
	    //Populating it with String values
	    linkedlist.add("AA");
	    linkedlist.add("BB");
	    linkedlist.add("CC");
	    linkedlist.add("DD");
	    linkedlist.add("EE");

	    //Displaying LinkedList elements
	    System.out.println("Orignial List: " +linkedlist);
	    linkedlist.add(2, "NN");
	    System.out.println("New List: " +linkedlist);

	}

}
