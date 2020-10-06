package com.company.class16;

import java.util.LinkedList;

public class Twelth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list = new LinkedList<>();
		list.add("Himanshu");
		list.add("Test");
		list.add("Check");
		list.add("Final");
		list.addLast("LAST");
		//System.out.println(list);
		for(String name : list)
		{
			System.out.println(name);
		}
	}

}
