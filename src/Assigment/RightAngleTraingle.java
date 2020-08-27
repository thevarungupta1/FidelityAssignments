package Assigment;

import java.util.Scanner;

public class RightAngleTraingle {

	static int a,b,c;
	Scanner sc = new Scanner(System.in);
	public boolean rightTraingle(int base, int perpendicular, int hypotenuse) {

		double sumofsides = Math.pow(perpendicular, 2) + Math.pow(base, 2);
		double squareofHypotenue = Math.pow(hypotenuse, 2);
		if (squareofHypotenue == sumofsides) {
			System.out.println("This is Right angle with sides :" + hypotenuse + " " + perpendicular + " " + base);
			return true;
		} else {
			System.out.println("This is not a Right angle with sides :" + hypotenuse + " " + perpendicular + " " + base);
			return false;
		}
	}
	public void inputTraingleValues()
	{
		System.out.print("Enter base value :");
		a= sc.nextInt();
		System.out.print("Enter height value :");
		b =sc.nextInt();
		System.out.print("Enter hypotenuse value :");
		c =sc.nextInt();
	}
	public static void main(String[] args) {
		RightAngleTraingle rat = new RightAngleTraingle();
		rat.inputTraingleValues();
		rat.rightTraingle(a, b, c);
	}
}
