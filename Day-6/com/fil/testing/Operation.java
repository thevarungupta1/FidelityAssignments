package com.fil.testing;

public class Operation {

	Integer num1;
	Integer num2;
	
	public Operation(Integer num1,Integer num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	
	public void substarct(Integer num1,Integer num2)
	{
		if(num1>num2)
			System.out.println("substarcted vale as:-"+(num1-num2));
		else 
			System.out.println("substarcted vale as:-"+(num2-num1));
	}
	
	public void devide(Integer num1,Integer num2)
	{
		if(num1>num2)
			System.out.println("divided vale as:-"+(num1/num2));
		else 
			System.out.println("divided vale as:-"+(num2/num1));
	}
	
	public void mutiple(Integer num1,Integer num2)
	{
		System.out.println("multiplied vale as:-"+(num1*num2));
	}
	
	public void reverse(Integer num1)
	{
		int r,rev=0;
		while(num1>0)
		{
			r=num1%10;
			rev=rev*10+r;
			num1=num1/10;
		}
		System.out.println("Reversed number as:-"+rev);
	}
}
