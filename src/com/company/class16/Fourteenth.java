package com.company.class16;

import java.util.LinkedList;

public class Fourteenth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<>();
		list.add("Himanshu");
		list.add("Test");
		list.add("Check");
		list.add("Final");
		list.addLast("LAST");
		
		System.out.println(list);
		
		System.out.println("List after adding value at First and last position : ");

		list.addFirst("First");
		list.addLast("Last Last");
		
		System.out.println(list);
	}

}
