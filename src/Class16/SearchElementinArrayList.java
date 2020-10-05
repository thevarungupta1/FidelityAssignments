package Class16;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchElementinArrayList {

	public static void main(String[] args) {
		ArrayList lst = addElements();
		searchElementsinArrayList(lst);
	}

	public static void searchElementsinArrayList(ArrayList<String> list) {
		int s = list.indexOf("Ben");
		if(s==-1) {
			System.out.println("Element is not present in ArrayList");
		}else
			System.out.println("Element is present in ArraList");
	}

	public static ArrayList<String> addElements() {
		ArrayList<String> elements = new ArrayList<String>(Arrays.asList("Masha", "Ben", "Dasha", "Bani"));
		System.out.println(elements);
		return elements;
	}
}
