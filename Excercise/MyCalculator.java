package excercise;

public class MyCalculator implements AdvanceAirthmetic{

	public int divisor_sum(int n) {
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			if(n%i==0)
				sum=sum+i;
		}
		return sum;
	}
	
	public static void main(String[] args)
	{
		MyCalculator mycal=new MyCalculator();
		int asum=mycal.divisor_sum(7);
		System.out.println("divisour sum as:-"+asum);
	}

}
