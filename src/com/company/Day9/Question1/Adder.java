package Day9.Question1;
import java.util.Scanner;

class Adder extends Arithmetic {
	public static void main(String args[]) {
		Arithmetic a= new Adder();
		Scanner scr= new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = scr.nextInt();
		System.out.println("Enter second number");
		int num2= scr.nextInt();
		int result = a.add(num1, num2);
		System.out.println(result);
	}

}
