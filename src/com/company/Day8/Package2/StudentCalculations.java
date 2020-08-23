package Day8.Package2;

import java.util.Scanner;
import Day8.Package1.*;

public class StudentCalculations{
	public static void main(String args[]) {
		Calculator cal= new Calculator();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of first Integer");
		int a = sc.nextInt();
		System.out.println("Enter the value of second Integer");
		int b = sc.nextInt();
		
		int result = cal.addition(a, b);
		System.out.println("Sum of a and b is :" +result);
		
		result= cal.subtraction(b, a);
		System.out.println("Subtraction of a and b is :" +result);
		
		result = cal.multiplication(a, b);
		System.out.println("Multiplication of a and b is :" +result);
		
		result = cal.division(b, a);
		System.out.println("Division of a and b is :" +result);
		
		cal.reveseOfNumber(12345);
		cal.factorial(5);
}
}