package Day9.Question3;

public class MyCalculator implements IAdvancedArithmetic {

	int sum=0;
	
	@Override
	public int divisor_sum(int n) {
		if(n>1000) 
			System.out.println("Invalid input");
		else {
			for(int i=1; i<=n;i++){
				if(n%i==0) {
					sum = sum+i;}}
			}
		return sum;
	}
}

