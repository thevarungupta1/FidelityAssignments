package Assigment;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyCalculator implements AdvancedArithmetic {

	
	static int i,n,sum;
	static Scanner sc;

	public int divisor_sum(int n) {
	
		for (i = 0; i <= n; i++) {
			if (i > 0 && n % i == 0) {
				sum=sum+i;
				
			} else {
				continue;
			}
		}
		return sum;
	}
	public int enterValue() {
		sc=new Scanner(System.in);
		System.out.print("Enter divisible number :");
		n= sc.nextInt();
		return n;
	}
	public static void main(String[] args) {
		MyCalculator calc = new MyCalculator();
		n= calc.enterValue();
		int num = calc.divisor_sum(n);
		System.out.println("Sum of all divisible number of :"+num);
		
	}

}
