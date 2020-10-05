package Class16;

import java.util.ArrayList;
import java.util.Arrays;

public class CopyArrayList {

	public static void main(String[] args) {
		ArrayList<String> list_one = new ArrayList<String>(Arrays.asList("Hello","World","All"));
		ArrayList<String> list_two = new ArrayList<String>(Arrays.asList("Employees","Needs","to","Join","here"));
		System.out.println("ArrayLists which is copied :"+list_one);
		System.out.println("ArrayLists before copying :"+list_two);
		list_two.addAll(0, list_one);
		//list_one.addAll(list_two);
		System.out.println("ArrayLists after copying list_one : "+list_two);
		
		

	}

}
