package Day16;

import java.util.ArrayList;
import java.util.Collections;

public class reverseArrayList {
	public static void main(String[] args)
	{
		ArrayList<Integer> str=new ArrayList<>();
		str.add(12);
		str.add(33);
		str.add(18);
		str.add(9);
		str.add(16);
		
		System.out.println("element of list:-");
		for(Integer s:str)
		System.out.println(s);
	
		Collections.reverse(str);
		System.out.println("element of list after reverse :-");
		for(Integer rev:str)
			System.out.println(rev);
	}

}
