package Day16;

import java.util.ArrayList;
import java.util.List;

public class CopyArrayList {
    public static void main(String[] args)
    {
	ArrayList<String> str=new ArrayList<>();
	str.add("puja");
	str.add("nita");
	str.add("arti");
	str.add("vindu");
	str.add("nisha");
	
	System.out.println("element of list-1 :-");
	for(String s:str)
		System.out.println(s);
	List<String> strnew=new ArrayList<>();
	strnew.addAll(str);
	System.out.println("element of list-2 :-");
	for(String ss:strnew)
		System.out.println(ss);
}
}
