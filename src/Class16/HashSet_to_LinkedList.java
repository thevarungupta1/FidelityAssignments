package Class16;

import java.util.HashSet;
import java.util.LinkedList;

public class HashSet_to_LinkedList {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Hello");
		hs.add("world");
		System.out.println("Hash Set elements :"+hs);
		LinkedList <String> list = new LinkedList<String>(hs);
		
//		list.addAll(hs);
		System.out.println("Linked List elements :"+list);
	}

}
