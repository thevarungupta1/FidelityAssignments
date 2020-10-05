package Class16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {
		ArrayList<String> list_one = new ArrayList<String>(Arrays.asList("Hello","World","All"));
		Collections.reverse(list_one);
		System.out.println(list_one);

	}

}
