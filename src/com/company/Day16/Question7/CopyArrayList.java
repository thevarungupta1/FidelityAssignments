package Day16.Question7;
import java.util.ArrayList;
import java.util.Collections;

public class CopyArrayList {
	public static void main(String args[]) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Ian");
		list1.add("Paul");
		list1.add("Nina");
		
		System.out.println("ArrayList one: ");
		for(String s: list1) {
			System.out.println(s);
		}
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Neha");
		list2.add("Ekta");
		list2.add("Deepanshu");
		
		System.out.println();
		System.out.println("ArrayList two: ");
		for(String s: list2) {
			System.out.println(s);
		}
		
		
		Collections.copy(list1, list2);
	    
		System.out.println();
		System.out.println("After Copying list2 to list1 :");
		
		System.out.println();
		System.out.println("ArrayList one: ");
		for(String s: list1) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("ArrayList two: ");
		for(String s: list2) {
			System.out.println(s);
		}
		
		
	}

}
