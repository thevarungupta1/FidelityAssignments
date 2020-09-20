package com.company.class16;

import java.util.ArrayList;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arr = new ArrayList<>();
			arr.add("FIRST");
			arr.add("SECOND");
			arr.add("THIRD");
			arr.add("FOURTH");
			

			for(String name : arr)
			{
			System.out.println("LIST is as follows : " + name);
			}
			String element = arr.get(1);
			
			System.out.println(element);
			
			
			
	}
}
