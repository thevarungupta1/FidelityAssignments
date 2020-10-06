package com.company.class16;

import java.util.Iterator;
import java.util.LinkedList;

public class Thirteenth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list = new LinkedList<>();
		list.add("Himanshu");
		list.add("Test");
		list.add("Check");
		list.add("Final");
		list.addLast("LAST");
		
		System.out.println(list);
		
		System.out.println("List in Reverse Order");
		Iterator it = list.descendingIterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
