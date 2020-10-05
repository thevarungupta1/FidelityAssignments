package Class16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapArrayList {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>(Arrays.asList("Hello","World","All"));
		System.out.println("List before swapping"+list);
		Collections.swap(list, 0, 2);
		System.out.println("List after swapping"+list);

	}

}
