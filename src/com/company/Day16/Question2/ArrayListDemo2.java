package Day16.Question2;
import java.util.ArrayList;

public class ArrayListDemo2 {
public static void main(String args[]) {
	ArrayList<Integer> arrl= new ArrayList<Integer>();
	
	arrl.add(10);
	arrl.add(20);
	arrl.add(30);
	arrl.add(40);
	
	System.out.println("Array List Before:");
	
	for(int i: arrl) {
		System.out.println(i);
	}
	
	arrl.add(0,50);
	System.out.println("Array List After adding an element at the beginning:");
	
	for(int i: arrl) {
		System.out.println(i);
	}
	
}
}
