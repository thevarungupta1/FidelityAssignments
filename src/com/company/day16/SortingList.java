//Write a Java program to sort a given array list

package day16;

import java.util.ArrayList;
import java.util.Collections;

public class SortingList {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("MG");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Kia");
		Collections.sort(cars);  
		for (String i : cars) {
			System.out.println(i);

		}
	}
}