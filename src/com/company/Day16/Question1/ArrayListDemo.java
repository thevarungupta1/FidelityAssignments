package Day16.Question1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
public static void main(String args[]) {
	
	ArrayList<String> al= new ArrayList<String>();
	al.add("Neha");
	al.add("Ekta");
	al.add("Deepanshu");
	
	/*
	 * Iterator<String> itr = al.iterator();
	 * while(itr.hasNext()) {
		System.out.println(itr.toString());
		itr.next();
	}
	 */
	
	
	for(String s: al) {
		System.out.println(s);
	}
}
}
