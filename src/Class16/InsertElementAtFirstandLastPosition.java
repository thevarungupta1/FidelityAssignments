package Class16;

import java.util.Arrays;
import java.util.LinkedList;

public class InsertElementAtFirstandLastPosition {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>(Arrays.asList("abc","xyz","mno"));
		System.out.println("Before adding first and last element"+list);
		list.addFirst("Hello");
		list.addLast("India");
		System.out.println("After adding first and last element"+list);

	}

}
