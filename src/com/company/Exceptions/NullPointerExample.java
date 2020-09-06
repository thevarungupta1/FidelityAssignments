package com.company.Exceptions;

public class NullPointerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[] = null;
		try {
		int length = arr.length;
		System.out.println(length);
		}
		catch(NullPointerException e)
		{
			
			System.out.println("Null Pointer Exception");
		}
		
		}

}
