package Day16.Question9;
import java.util.ArrayList;

public class CompareArraylist {
	public static void main(String args[]) {
		ArrayList<String> list1= new ArrayList<String>();
		list1.add("Ian");
		list1.add("Paul");
		list1.add("Nina");
		
		ArrayList<String> list2= new ArrayList<String>();
		list2.add("Ian");
		list2.add("ekta");
		list2.add("Nina");
		
		ArrayList<String> list3 = new ArrayList<String>();
		for(String s : list1) {
			list3.add(list2.contains(s) ? "Yes" : "No");
		}
		
		for(String s : list3) {
			System.out.println(s);
		}
		
		
		
	}
}