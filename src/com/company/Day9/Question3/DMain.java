package Day9.Question3;

import java.util.Scanner;

public class DMain {
	public static void main(String args[]) {
		MyCalculator cal= new MyCalculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		int result = cal.divisor_sum(num);
		System.out.println(result);
	}

}
