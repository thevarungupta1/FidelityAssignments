package com.company.class16;

import java.util.ArrayList;

public class Eighth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arrlist = new ArrayList<>();
		arrlist.add(100);
		arrlist.add(1200);
		arrlist.add(300);
		arrlist.add(40);
		
		System.out.println(arrlist);
		
		ArrayList<Integer> newlist = new ArrayList<>();
		newlist.add(100);
		newlist.add(1200);
		newlist.add(300);
		newlist.add(40);
		System.out.println(newlist);
		
		
		System.out.println(arrlist.equals(newlist));
	}

}
