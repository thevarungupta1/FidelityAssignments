package Day16.Question10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class SwapElements {
public static void main(String args[]) {
	ArrayList<String> empnames= new ArrayList<String>();
	empnames.add(0,"neha");
	empnames.add(1,"bharti");
	empnames.add(2,"ekta");
	empnames.add(3,"deepu");
	
	System.out.println("Arraylist before swapping: ");
	
	for(String s :empnames) {
		System.out.println(s);
	}
	
	Collections.swap(empnames, 0, 3);
	
    System.out.println("Arraylist after swapping: ");
	
	for(String s :empnames) {
		System.out.println(s);
	}
	
}

}
