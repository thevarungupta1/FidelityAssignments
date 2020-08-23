package Day8.Package1;
import java.util.Scanner;

public class Calculator implements ICalculator{

	@Override
	public int addition(int a, int b) {
		return a+b;
	}

	@Override
	public int subtraction(int a, int b) {
		return a-b;
	}

	@Override
	public int multiplication(int a, int b) {
		return a*b;
	}

	@Override
	public int division(int a, int b) {
		return a/b;
	}

	@Override
	public void factorial(int a) {
		int i,fact=1;
		for(i=1;i<=a;i++) {
			fact =fact*i;
		}
		System.out.println("Factorial of " + a + " is " +fact);
		}

	@Override
	public void reveseOfNumber(int a) {
		int b =a,rev=0, r;
		while(b>0) {
			r= b%10;
			b= b/10;
			rev= rev*10+r;
		}
		System.out.println("Reverse of " + a + " is " +rev);
	}
	}

