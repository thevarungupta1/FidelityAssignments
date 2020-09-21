package Day16.Question8;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseElements {
	public static void main(String args[]) {
		ArrayList<Integer> arrlist= new ArrayList<Integer>();
		arrlist.add(10);
		arrlist.add(20);
		arrlist.add(30);
		arrlist.add(40);
		
		System.out.println("Array List Before:");
		
		for(int i : arrlist) {
			System.out.println(i);
		}
		
		Collections.reverse(arrlist);
		
System.out.println("Array List After Reverse:");
		
		for(int i : arrlist) {
			System.out.println(i);
		}
		
		
	}

}
