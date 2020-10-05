package Class16;

import java.util.Arrays;
import java.util.LinkedList;

public class AppendElementLinkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList<>(Arrays.asList("abc","xyz","mno"));
		list.addLast("ccc");
		System.out.println(list);

	}

}
