package Day16.Question13;
import java.util.LinkedList;
import java.util.Iterator;

public class IterateReverseOrder {
	public static void main(String args[]) {
		LinkedList<String> subjects = new LinkedList<String>();
		subjects.add("English");
		subjects.add("Java");
		subjects.add("Python");
		subjects.add("Ruby");
		
		
		 System.out.println("Linked List in original order:");
		 
		Iterator<String> itr = subjects.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
		 
		
		
		System.out.println("Linked List in reverse order:");
		
		Iterator<String> itr1= subjects.descendingIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		
		
		
		
		
	}

}
