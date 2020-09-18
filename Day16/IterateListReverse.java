package Day16;

import java.util.ArrayList;
import java.util.Collections;

public class IterateListReverse {
	
	 public static void main(String[] args)
	    {	
		ArrayList<Integer> list=new ArrayList<>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		
		System.out.println("element of list in insertion order:-");
		for(Integer s:list)
		System.out.println(s);
		Collections.reverse(list);
		
		System.out.println("element of list in reverse order:-");
		for(Integer s1:list)
		System.out.println(s1);
		
		

}
}