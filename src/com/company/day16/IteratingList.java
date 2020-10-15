//Write a Java program to iterate a linked list in reverse order
package day16;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratingList {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();

		ll.add("Red");
		ll.add("Green");
		ll.add("Black");
		ll.add("Pink");
		ll.add("orange");

		// print original list
		System.out.println("Original linked list:" + ll);  

		Iterator it = ll.descendingIterator();

		// Print list elements in reverse order
		System.out.println("Elements in Reverse Order:");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
