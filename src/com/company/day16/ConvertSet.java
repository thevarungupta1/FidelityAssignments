//Write a Java program to convert a hash set to an array
package day16;

import java.util.HashSet;

public class ConvertSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();

		set.add("Violet");
		set.add("Green");
		set.add("Black");
		set.add("White");
		set.add("Cyan");
		set.add("Yellow");
		System.out.println("Original Hash Set: " + set);

		String[] array = new String[set.size()];
		set.toArray(array);

		System.out.println("Array elements: ");
		for(String element : array){
			System.out.println(element);

		}
	}
}
