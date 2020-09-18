package Day16;

import java.util.ArrayList;

public class AppendAtEndOfList {
    public static void main(String[] args)
    {	
	ArrayList<Integer> list=new ArrayList<>();
	list.add(11);
	list.add(12);
	list.add(13);
	System.out.println("element of list:-");
	for(Integer s:list)
	System.out.println(s);
	
	list.add(99);
	
	System.out.println("element of list after appending at end of list:-");
	for(Integer s1:list)
	System.out.println(s1);
}
}