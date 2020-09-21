package Day16.Question6;
import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
	public static void main(String args[]) {
		ArrayList<Integer> age= new ArrayList<Integer>();
		age.add(25);
		age.add(19);
		age.add(23);
		
	System.out.println("Age before sorting :");
	for(int i: age) {
		System.out.println(i);
	}
	
	Collections.sort(age);
	
	System.out.println("Age after sorting :");
	for(int i: age) {
		System.out.println(i);
	}
		
	}

}
