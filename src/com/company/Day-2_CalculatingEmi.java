import java.io.*; 

public class CalculatingEmi { 

	public static void main (String[] args) 
	{ 

		float loanAmount, rateOfInterest, loanDuration, monthlyEmi; 
		loanAmount = 100000; 
		rateOfInterest = 2; 
		loanDuration = 10; 
		
		rateOfInterest = rateOfInterest / (12 * 100);  
		loanDuration = loanDuration * 12; 
		monthlyEmi = (loanAmount * rateOfInterest * (float)Math.pow(1 + rateOfInterest, loanDuration))  
				/ (float)(Math.pow(1 + rateOfInterest, loanDuration) - 1); 

		System.out.println("Monthly EMI is = " + monthlyEmi); 
	} 
} 

