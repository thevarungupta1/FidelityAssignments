package com.company.class16;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Himanshu");
		list.add("Test");
		list.add("Maths");
		
		ArrayList<Integer> init = new ArrayList<>();
		init.add(5);
		init.add(60);
		init.add(9);
		
		
		System.out.println(list);
			
		System.out.println(init);
		Collections.sort(init);
		System.out.println(init);
		
		for(String name : list)
		{
			System.out.println(name);
		}
		

		
		
//		ArrayList obj = new ArrayList<>();
//		obj.add("Himanshu");
//		obj.add(1);
//		obj.add(20.10);
//		obj.add(null);
//		
//		System.out.println(obj.toString());
//		
//		for (Object obj1 : obj) {
//			System.out.println(obj1);
//		}
		
	}


}
