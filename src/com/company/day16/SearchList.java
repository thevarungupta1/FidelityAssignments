//Write a Java program to search an element in a array list.
package day16;

import java.util.ArrayList;

public class SearchList {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(111);
		al.add(100);
		al.add(209);
		al.add(500);
		
		boolean ans = al.contains(111); 
		  
        if (ans) 
            System.out.println("The list contains 2"); 
        else
            System.out.println("The list does not contains 2"); 

	}

}
