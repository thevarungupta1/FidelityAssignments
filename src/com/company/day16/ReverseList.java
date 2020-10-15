//Write a Java program to reverse elements in a array list
package day16;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseList {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Red");
		al.add("White");
		al.add("Green");
		al.add("Black");
		al.add("Pink");
		System.out.println("Original List: "+al);
		Collections.reverse(al);
		System.out.println("Reversed List: "+al);

	}

}
