package Day9.Question6;

import java.util.Scanner;

public class DMain {
	public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the value of first integer");
		int a = s.nextInt();
		System.out.println("Enter the value of second integer");
		int b = s.nextInt();
		System.out.println("Enter the value of third integer");
		int c = s.nextInt();
		RightAngleTriangle rt = new RightAngleTriangle(a,b,c);
		rt.rightAngle();
	}

}
