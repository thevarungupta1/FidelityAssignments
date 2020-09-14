package com.company.Exceptions;


class parent
{
	public void print()
	{
	System.out.println("Parent Class");
}}

class child extends parent
{
	public void print()
	{
	System.out.println("child Class");
}}


public class ClassCastExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		parent cc = new parent();
		child child1 = new child();
		child c1 = (child) new parent();

	}

}
