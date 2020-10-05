package Class16;

import java.util.Arrays;
import java.util.LinkedList;

public class IterateLinkedListReverseOrder {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>(Arrays.asList("abc","xyz","mno"));
		System.out.println(list);
		int s = list.size()-1;
		
		while(s>=0)
		{
			System.out.print(list.get(s)+",");
			s--;
		}

	}

}
