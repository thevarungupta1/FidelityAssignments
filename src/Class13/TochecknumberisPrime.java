package Class13;

import java.util.Scanner;

public class TochecknumberisPrime {
	
	
 static int flag = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number to b checked");
		Scanner in = new Scanner (System.in);
		try
		{
		int num = in.nextInt();
		
		for (int i=2; i<= num/2 ; i++)
		{
			if ((num % i)==0);
		
			{
				System.out.println("Number is not Prime");
				flag = 1;
				break;
			}}
		
		if(flag==0)
				System.out.println("Number is Prime");
		
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		
	}}

