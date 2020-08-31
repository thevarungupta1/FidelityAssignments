package com.company;

class subclass {

	public void func()
	{
	System.out.println ("Hello I am a motorcycle, I am a cycle with an engine.");
}
	}


class superclass extends subclass
{

	public void func()
	{
	System.out.println ("My ancestor is a cycle who is a vehicle with pedals.");
	super.func();
}
}


public class callfunction
{
	public static void main(String[] args)
	{
		superclass c = new superclass();
		c.func();
}
}