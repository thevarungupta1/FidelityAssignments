package ExceptionHandling.Question3;

import java.util.Scanner;

public class Arithmetic {
public static void main(String args[]) {
	int a,b,c;
	Scanner s= new Scanner(System.in);
	System.out.println("Enter value of a");
	a= s.nextInt();
	System.out.println("Enter value of b");
	b= s.nextInt();
	try {
	c= b/a;
	System.out.println("Value of c : "  +c);
	}
	catch(ArithmeticException e) {
		e.printStackTrace();
	}
	finally {
		System.out.println("Releasing all the resources");
	}
	
}
}
