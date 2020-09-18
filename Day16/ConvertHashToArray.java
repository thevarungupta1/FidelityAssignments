package Day16;

import java.util.HashSet;

public class ConvertHashToArray {
	public static void main(String[] args)
	{
		HashSet<String> has=new HashSet<>();
		has.add("a");
		has.add("b");
		has.add("c");
		has.add("d");
		has.add("e");
		
		Object[] str=has.toArray();
		for(Object s:str)
			System.out.println(s);
	}

}
