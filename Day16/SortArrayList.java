package Day16;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
	public static void main(String[] args)
	{
		ArrayList<String> str=new ArrayList<>();
		str.add("puja");
		str.add("nita");
		str.add("arti");
		str.add("vindu");
		str.add("nisha");
		
		System.out.println("before sorting list as:-");
		for(String s:str)
			System.out.println(s);
		Collections.sort(str);
		System.out.println("After sorting list as:-");
		for(String s:str)
			System.out.println(s);
			
	}

}
