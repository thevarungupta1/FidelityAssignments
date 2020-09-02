package excercise;

import java.util.Scanner;

public class RightAngleTrangle {
	
	public static void checkRTrangle(int a,int b, int c)
	{
		int LF=((a*a)+(b*b));
		if(LF==(c*c))
			System.out.println("yes it's a right angle trangle");
		else
			System.out.println("Sorry it's not right angle trangle");
	}

	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base of trangle");
		int a=sc.nextInt();
		System.out.println("Enter height of trangle");
		int b=sc.nextInt();
		System.out.println("Enter hypotenuse of trangle");
		int c=sc.nextInt();
		checkRTrangle(a,b,c);
	}
}
