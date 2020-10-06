package com.company.class16;

import java.util.HashSet;

public class Fifteenth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hash = new HashSet<>();
		hash.add("abc");
		hash.add("def");
		hash.add("ghi");
		hash.add("jkl");
		System.out.println(hash);
		
		
		String[] array = new String[hash.size()];
		hash.toArray(array);
	 
	     // Displaying Array elements
	     System.out.println("Array elements: ");
	     for(String temp : array){
	        System.out.println(temp);
	}
	}
}
