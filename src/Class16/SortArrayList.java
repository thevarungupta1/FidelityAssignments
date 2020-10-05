package Class16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class SortArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> lst = new ArrayList<Integer>(Arrays.asList(4,7,1,9,34,5,0));
		System.out.println("Before sorting :"+lst);
		Collections.sort(lst);
		System.out.println("After sorting :"+lst);
		
	}
}
