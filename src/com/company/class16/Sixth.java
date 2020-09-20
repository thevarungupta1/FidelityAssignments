package com.company.class16;

import java.util.ArrayList;

public class Sixth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arrlist = new ArrayList<>();
		arrlist.add(100);
		arrlist.add(1200);
		arrlist.add(300);
		arrlist.add(40);
		
		ArrayList<Integer> nelist = new ArrayList<>();
		arrlist.add(40);
		arrlist.add(200);
		arrlist.add(3000);
		arrlist.add(4004);
		
		ArrayList<String> str = new ArrayList<>();
			str.add("Himanshu");
				
		arrlist.addAll(2, nelist);
				
		System.out.println(arrlist);
	}

}
