package Day16.Question12;
import java.util.LinkedList;

public class EndOfLinkedList {
public static void main(String args[]) {
	LinkedList<Integer> empAge= new LinkedList<Integer>();
	empAge.add(20);
	empAge.add(21);
	empAge.add(22);
	empAge.add(23);
	
	for(int a: empAge) {
		System.out.println(a);
	}
	
	empAge.add(24);
	
	System.out.println("Adding new element: ");
	
	for(int a: empAge) {
		System.out.println(a);
	}
	
	
}
	
}
