package com.company.Exceptions;

public class ArrayIndexoutofBound {
	
	public static void main(String[] args)
	{	
	String[] strArray = new String[3];
	strArray[0] = "sdd";
	strArray[1] = "fcv";
	strArray[2] = "vdfg";

	try
	{
	System.out.println("Value of STring array at 100th Position is :" + strArray[100]);
	}
	catch(ArrayIndexOutOfBoundsException e )
	{
		System.out.println("Invalid Index");
		
	}
	}
	
}