package com.company.class16;

import java.util.ArrayList;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arr = new ArrayList<>();
			arr.add("FIRST");
			arr.add("SECOND");
			arr.add("THIRD");
			arr.add("FOURTH");
			

			for(String name : arr)
			{
			System.out.println(name);
	}
			
			arr.add(1, "FIRST POSITION");
			
			for(String name : arr)
			{
			System.out.println(name);
	}
	}
}
