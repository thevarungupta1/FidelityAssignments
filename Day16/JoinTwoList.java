package Day16;

import java.util.ArrayList;

public class JoinTwoList {
	public static void main(String[] args)
	{
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(11);
		list1.add(12);
		list1.add(13);
		
		System.out.println("element of list1:-");
		for(Integer s:list1)
		System.out.println(s);
		
		ArrayList<Integer> list2=new ArrayList<>();
		list2.add(21);
		list2.add(22);
		list2.add(23);
		
		System.out.println("element of list2:-");
		for(Integer s2:list2)
		System.out.println(s2);
		
		list1.addAll(list2);
		
		System.out.println("element of list1 after joining it with list2:-");
		for(Integer s2:list1)
		System.out.println(s2);
	}

}
