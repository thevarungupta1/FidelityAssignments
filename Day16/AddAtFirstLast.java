package Day16;

import java.util.LinkedList;
import java.util.List;

public class AddAtFirstLast {
	public static void main(String[] args)
	{
		List<String> list= new LinkedList<>();
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		list.add("eee");
		
		list.add(0, "aaa");
		list.add("fff");
		
		for(String str:list)
			System.out.println(str);
	}

}
