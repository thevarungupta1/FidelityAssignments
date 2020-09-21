package Day16.Question4;
import java.util.ArrayList;

public class SearchElement {
public static void main(String args[]) {
	ArrayList<String> names = new ArrayList<String>();
	
	names.add("Deepanshu");
	names.add("Ian");
	names.add("Paul");
	
	System.out.println("Searching an element:");
	if(names.contains("kj")) {
	System.out.println(" Found the element");
	}
	else {
		System.out.println(" Element not found");
	}
}
}

