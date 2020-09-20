package com.company.class16;

import java.util.ArrayList;
import java.util.Collections;

public class Fifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arrlist = new ArrayList<>();
		arrlist.add(100);
		arrlist.add(1200);
		arrlist.add(300);
		arrlist.add(40);
			
		System.out.println(arrlist);
		Collections.sort(arrlist);
		
		System.out.println(arrlist);
		
		for(Integer into : arrlist)
		{
			System.out.println(into);
		}
	}

}
