package com.company;

interface AdvancedArithmetic {

	int divisor_sum(int a);
}

class myCalculator implements AdvancedArithmetic{
	int sum=0;

	@Override
	public int divisor_sum(int a) {
		for(int i=1;i<=a;i++) { 
			if(a%i==0) { 
				sum=sum+i; 
			}
		}
		System.out.println("Sum of all divisors is: "+sum);
		return sum;
	}
	public static void main (String[]args) {
		myCalculator cal=new myCalculator();
		cal.divisor_sum(6);
	}
}