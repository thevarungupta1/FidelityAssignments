package Day13;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number ");
		int num=sc.nextInt();
		int count=0;
		try
		{
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
				count++;
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		if(count>0)
			System.out.println("Give number is Not Prime");
		else
			System.out.println("Given number is Prime");
	}

}
