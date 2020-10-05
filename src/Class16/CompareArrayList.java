package Class16;

import java.util.ArrayList;
import java.util.Arrays;

public class CompareArrayList {

	public static void main(String[] args) {
		ArrayList<String> list1= new ArrayList<String>(Arrays.asList("Hello","World","All"));
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("Hello","World","All"));
		boolean b = list1.equals(list2);
		if(b) {
			System.out.println("Array List are equal");
		}else
			System.out.println("Array List is not equal");

	}

}
